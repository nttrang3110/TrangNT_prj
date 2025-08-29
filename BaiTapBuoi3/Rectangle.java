package Baitapbuoi3;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double Perimeter(){
       return (width + height) * 2;
    }
    public double area(){
        return width * height;
    }
    public void displayInfo(){
        System.out.println("Chu vi hinh chu nhat: " + Perimeter());
        System.out.println("Dien tich hinh chu nhat: " + area() );
    }
}

