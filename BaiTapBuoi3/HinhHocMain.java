package Baitapbuoi3;

import java.util.Scanner;

public class HinhHocMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu dai: ");
        double height = scanner.nextDouble();
        System.out.println("Nhap ban kinh: ");
        double radius = scanner.nextDouble();

        Rectangle r1 = new Rectangle(width,height);
        r1.displayInfo();

        Circle c1 = new Circle(radius);
        c1.displayInfo();

        double sum1 = r1.Perimeter() + c1.Perimeter();
        System.out.println("Tong chu vi cua hai hinh: " + sum1);
        double sum2 = r1.area() + c1.area();
        System.out.println("Tong dien tich cua hai hinh: " + sum2);
    }
}
