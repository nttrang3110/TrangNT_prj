-- 1. Thêm 1 khách hàng mới vào bảng customers
INSERT INTO dbo.Customers (CustomerID, Name, City, Email)
VALUES (13,'Thomas','Hanoi','thomas@mail.com')

--2. Thêm 1 sản phẩm mới vào bảng products.
INSERT INTO dbo.Products (ProductID, ProductName, Price, Category)
VALUES (113, 'Ipad', 1000 ,'Electronics')

--3. Thêm đơn hàng ID = 1021 do khách hàng có ID = 1 đặt ngày 2025-07-28
INSERT INTO dbo.Orders (OrderID,CustomerID,OrderDate)
VALUES (1021,1,'2025-07-28')

--4. Thêm chi tiết đơn hàng có ID = 1021 gồm 2 sản phẩm có ID = 1
INSERT INTO dbo.Products 
VALUES (1,'Speaker',100,'Electronics')
INSERT INTO dbo.OrderDetail (OrderDetailID, OrderID, ProductID, Quantity)
VALUES (43, 1021, 1, 2)

--5. Cập nhật giá của sản phẩm "Laptop" thành 1500
UPDATE dbo.Products 
SET Price = 1500
WHERE ProductName = 'Laptop'

--6. Xóa đơn hàng và chi tiết đơn hàng của người dùng có ID = 1
DELETE od
FROM dbo.OrderDetail od
JOIN dbo.Orders o ON od.OrderID = o.OrderID
WHERE o.CustomerID = 1;
DELETE FROM dbo.Orders
WHERE CustomerID = 1;

--7.  Hiển thị danh sách đơn hàng, bao gồm:​ Mã đơn hàng​, Ngày đặt hàng​, Tên khách hàng
SELECT Name, OrderID, OrderDate
FROM dbo.Orders o 
JOIN dbo.Customers c ON o.CustomerID = c.CustomerID

--8. Hiển thị chi tiết từng đơn hàng, bao gồm:​ Mã đơn hàng​, Tên sản phẩm​, Số lượng đặt​, Đơn giá
SELECT OrderID, ProductName, Quantity, Price
FROM dbo.OrderDetail od 
JOIN dbo.Products p ON od.ProductID = p.ProductID

--9. Tính tổng số lượng sản phẩm được đặt cho từng đơn hàng.​ Hiển thị: Mã đơn hàng, tổng số lượng sản phẩm 
SELECT OrderID, Sum(Quantity) AS Total_Products
FROM dbo.OrderDetail 
GROUP BY OrderID

--10.Tính tổng tiền của mỗi đơn hàng.​ Tổng tiền = Số lượng × Giá​ Hiển thị: Mã đơn hàng, tổng tiền.​
SELECT OrderID, Sum(Quantity * Price) AS Total_Price
FROM dbo.OrderDetail od
JOIN dbo.Products p ON od.ProductID = p.ProductID 
GROUP BY OrderID

--11. Tìm khách hàng có tổng giá trị đơn hàng cao nhất
SELECT TOP 1 c.Name, c.CustomerID, Sum(Quantity * Price) AS Total_Price
FROM dbo.OrderDetail od
JOIN dbo.Products p ON od.ProductID = p.ProductID 
JOIN dbo.Orders o ON od.OrderID = o.OrderID
JOIN dbo.Customers c ON o.CustomerID = c.CustomerID 
GROUP BY c.Name, c.CustomerID
ORDER BY Total_Price DESC

--12. Tỉm sản phẩm có giá cao thứ 3 
SELECT * FROM dbo.Products 

SELECT Price
FROM dbo. Products p
GROUP BY p.Price
ORDER BY p.Price DESC
OFFSET 2 ROWS FETCH NEXT 1 ROWS ONLY

SELECT * FROM dbo.Products p WHERE PRICE = (
SELECT Price
FROM dbo. Products p
GROUP BY p.Price
ORDER BY p.Price DESC
OFFSET 2 ROWS FETCH NEXT 1 ROWS ONLY
)

--13. JOIN kết hợp nhiều bảng: Liệt kê danh sách khách hàng và tất cả sản phẩm họ đã mua (có cả số lượng, giá, và tổng tiền của từng dòng).
SELECT 
    c.CustomerID, 
    c.Name, 
    p.ProductName, 
    od.Quantity, 
    p.Price, 
    od.Quantity * p.Price AS Total_Price
FROM dbo.Customers c 
JOIN dbo.Orders o ON c.CustomerID = o.CustomerID 
JOIN dbo.OrderDetail od ON o.OrderID = od.OrderID 
JOIN dbo.Products p ON od.ProductID = p.ProductID
ORDER BY c.CustomerID ASC;

--14. Tìm tất cả khách hàng có tổng số lượng sản phẩm mua > 50.
SELECT c.CustomerID, c.Name, SUM(od.Quantity) AS Product_Numbers
FROM dbo.Customers c
JOIN dbo.Orders o ON c.CustomerID = o.CustomerID
JOIN dbo.OrderDetail od ON o.OrderID = od.OrderID 
GROUP BY c.CustomerID, c.Name
HAVING SUM(od.Quantity) > 20;

--15. Tìm những sản phẩm có giá cao hơn giá trung bình của tất cả sản phẩm.
SELECT * 
FROM dbo.Products p 
WHERE PRICE > (SELECT AVG(PRICE) FROM dbo.Products p)

--16. Hiển thị danh sách khách hàng kèm theo tổng tiền lớn nhất của một đơn hàng mà họ đã đặt.

CREATE VIEW OrderSummary
AS
SELECT 
    c.CustomerID, 
    c.Name, 
    od.OrderID, 
    SUM(od.Quantity * p.Price) AS TotalPrice
FROM dbo.OrderDetail od 
JOIN dbo.Products p ON od.ProductID = p.ProductID
JOIN dbo.Orders o ON o.OrderID = od.OrderID
JOIN dbo.Customers c ON o.CustomerID = c.CustomerID
GROUP BY od.OrderID, c.CustomerID, c.Name;

SELECT CustomerID, MAX(TotalPrice)
FROM OrderSummary
GROUP BY CustomerID
ORDER BY CustomerID ASC

--c2:
SELECT t.CustomerID, c.Name, MAX(t.TotalPrice) AS MaxOrderPrice
FROM (
    SELECT 
        c.CustomerID, 
        od.OrderID, 
        SUM(od.Quantity * p.Price) AS TotalPrice
    FROM dbo.OrderDetail od 
    JOIN dbo.Products p ON od.ProductID = p.ProductID
    JOIN dbo.Orders o ON o.OrderID = od.OrderID
    JOIN dbo.Customers c ON o.CustomerID = c.CustomerID
    GROUP BY c.CustomerID, od.OrderID
) t
JOIN dbo.Customers c ON t.CustomerID = c.CustomerID
GROUP BY t.CustomerID, c.Name
ORDER BY t.CustomerID ASC;



--17. Tính tổng tiền từng đơn hàng, sau đó từ kết quả đó chọn ra đơn hàng có tổng tiền > 500.
SELECT od.OrderID, SUM (Quantity * Price)
FROM dbo.OrderDetail od 
JOIN dbo.Products p ON od.ProductID = p.ProductID 
GROUP BY od.OrderID
HAVING  SUM (Quantity * Price) > 500
 -- Cách viết với subquery trong FROM
SELECT t.OrderID, t.TotalPrice
FROM (
    SELECT od.OrderID, SUM(od.Quantity * p.Price) AS TotalPrice
    FROM dbo.OrderDetail od
    JOIN dbo.Products p ON od.ProductID = p.ProductID
    GROUP BY od.OrderID
) t
WHERE t.TotalPrice > 500;

--18. DELETE có subquery Xóa tất cả đơn hàng mà tổng tiền < 100.
-- Customers
ALTER TABLE Customers
ADD isDeleted BIT NOT NULL DEFAULT 0;

-- Orders
ALTER TABLE Orders
ADD isDeleted BIT NOT NULL DEFAULT 0;

-- Products
ALTER TABLE Products
ADD isDeleted BIT NOT NULL DEFAULT 0;

-- OrderDetail
ALTER TABLE OrderDetail
ADD isDeleted BIT NOT NULL DEFAULT 0;

UPDATE dbo.Orders
SET isDeleted = 1
WHERE OrderID IN (
SELECT o.OrderID
FROM dbo.Orders o
JOIN dbo.OrderDetail od ON o.OrderID = od.OrderID
JOIN dbo.Products p ON od.ProductID = p.ProductID
GROUP BY o.OrderID
HAVING SUM(Quantity * Price) < 100)

UPDATE od
SET od.isDeleted = 1
FROM dbo.OrderDetail od
JOIN dbo.Orders o ON od.OrderID = o.OrderID
WHERE o.isDeleted = 1;








