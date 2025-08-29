package Baitapbuoi2;

import java.util.Scanner;

public class JavaBai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Tổng hai số nguyên là: " + sum);
        scanner.close();
    }
}

