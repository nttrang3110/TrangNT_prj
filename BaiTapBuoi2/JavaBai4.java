package Baitapbuoi2;

import java.util.Scanner;

public class JavaBai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Số nguyên đã nhập là số chẵn");
        } else {
            System.out.println("Số nguyên đã nhập là số lẻ");
        }
        scanner.close();
    }
}

