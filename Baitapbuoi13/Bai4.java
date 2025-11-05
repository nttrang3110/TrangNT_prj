package Baitapbuoi13;

//Bài 4: Lọc và sắp xếp tên
//Cho danh sách các tên (chuỗi).
//Lọc bỏ các tên rỗng hoặc null.
//Sắp xếp theo thứ tự bảng chữ cái.

import java.util.ArrayList;
import java.util.List;

public class Bai4 {
    public static void main(String[] args){
        List<String> danhSachTen = new ArrayList<>();
        danhSachTen.add("Alice");
        danhSachTen.add("Tom");
        danhSachTen.add("Annie");
        danhSachTen.add("James");
        danhSachTen.add("Lyn");

        List<String> danhSachTenDaSapXep = danhSachTen.stream()
                .sorted()
                .toList();
        System.out.println("Danh sách tên theo thứ tự Alphabet: " +danhSachTenDaSapXep);
    }
}
