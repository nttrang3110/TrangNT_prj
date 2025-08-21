package BaiTapBuoi2;

import java.util.Scanner;

public class JavaBai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều dài: ");
        double a = scanner.nextDouble();
        System.out.println("Chiều rộng: ");
        double b = scanner.nextDouble();
        if (a > 0 && b > 0) {
            double dien_tich = a * b;
            System.out.println("Diện tích hình chữ nhật là: " + dien_tich);
        } else {
            System.out.println("Lỗi! a và b phải lớn hơn 0");
        }
            scanner.close();
    }
}

