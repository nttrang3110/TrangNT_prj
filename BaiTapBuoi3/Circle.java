package Baitapbuoi3;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double Perimeter(){
        return radius * 2 * Math.PI;
    }
    double area(){
        return radius * radius * Math.PI;
    }
    public void displayInfo(){
        System.out.println("Chu vi hinh tron: " + Perimeter());
        System.out.println("Dien tich hinh tron: "+ area() );
    }
}
