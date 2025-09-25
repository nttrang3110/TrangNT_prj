-- 1. Thêm 1 khách hàng mới vào bảng customers
INSERT INTO dbo.Customers (CustomerID, Name, City, Email)
VALUES (13,'Thomas','Hanoi','thomas@mail.com');

--2. Thêm 1 sản phẩm mới vào bảng products.
INSERT INTO dbo.Products (ProductID, ProductName, Price, Category)
VALUES (113, 'Ipad', 1000 ,'Electronics');

--3. Thêm đơn hàng ID = 1021 do khách hàng có ID = 1 đặt ngày 2025-07-28
INSERT INTO dbo.Orders (OrderID,CustomerID,OrderDate)
VALUES (1021,1,'2025-07-28');

--4. Thêm chi tiết đơn hàng có ID = 1021 gồm 2 sản phẩm có ID = 1
INSERT INTO dbo.OrderDetail (OrderDetailID, OrderID, ProductID, Quantity)
VALUES (41, 1021, 113, 5), (42, 1021, 101, 1);

--5. Cập nhật giá của sản phẩm "Laptop" thành 1500
UPDATE dbo.Products 
SET Price = 1500
WHERE ProductName = 'Laptop';

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
JOIN dbo.Customers c ON o.CustomerID = c.CustomerID;

--8. Hiển thị chi tiết từng đơn hàng, bao gồm:​ Mã đơn hàng​, Tên sản phẩm​, Số lượng đặt​, Đơn giá
SELECT OrderID, ProductName, Quantity, Price
FROM dbo.OrderDetail od 
JOIN dbo.Products p ON od.ProductID = p.ProductID;

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





