package Baitapbuoi2;

import java.util.Scanner;

public class JavaBai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.println("Nhập bán kính: ");
        double radius = scanner.nextDouble();

        if (radius>0){
            double circumference = 2 * PI * radius;
            double area = PI * radius * radius;
            System.out.println ("Chu vi hình tròn là: " + circumference);
            System.out.println ("Diện tích hình tròn là: " + area);
        } else {
            System.out.println ("Lỗi nhập bán kính r");
        }
        scanner.close();
    }
}
