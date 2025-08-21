package BaiTapBuoi2;

import java.util.Scanner;

//Viết chương trình nhập năm và kiểm tra xem năm đó có phải năm nhuận không?
//Yêu cầu: Năm nhuận nếu chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100

public class JavaBai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một năm bất kỳ:");
        int nam = scanner.nextInt();
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
            System.out.println("Năm đã nhập là năm nhuận");
        } else {
            System.out.println("Năm đã nhập không phải là năm nhuận");
        }
        scanner.close();
    }
}