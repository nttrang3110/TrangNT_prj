package Baitapbuoi13;

import java.util.ArrayList;
import java.util.List;

//Bài 2: Bình phương các số lẻ
//Cho danh sách các số nguyên.
// Hãy tạo danh sách mới chứa bình phương của các số lẻ.

public class Bai2 {
    public static void main(String[] args){
        List<Integer> danhSachSoNguyen = new ArrayList<>();
        danhSachSoNguyen.add(1);
        danhSachSoNguyen.add(2);
        danhSachSoNguyen.add(3);
        danhSachSoNguyen.add(4);
        danhSachSoNguyen.add(5);


        List<Integer> danhSachBinhPhuong = danhSachSoNguyen.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .toList();

        System.out.println("Danh sách bình phương các số lẻ:" + danhSachBinhPhuong);
    }
}
