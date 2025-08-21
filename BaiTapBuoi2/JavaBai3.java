package BaiTapBuoi2;

import java.util.Scanner;

public class JavaBai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.println("Nhập bán kính: ");
        double r = scanner.nextDouble();
        if (r>0){
            double chu_vi = 2 * PI * r;
            double dien_tich = PI * r * r;
            System.out.println ("Chu vi hình tròn là: " + chu_vi);
            System.out.println ("Diện tích hình tròn là: " + dien_tich);
        } else {
            System.out.println ("Lỗi nhập bán kính r");
        }
        scanner.close();
    }
}
