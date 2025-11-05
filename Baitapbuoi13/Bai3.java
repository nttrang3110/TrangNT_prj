package Baitapbuoi13;
//Bài 3: Đếm chuỗi có độ dài > 3
//Cho danh sách các chuỗi (tên người).
// Hãy đếm xem có bao nhiêu chuỗi có độ dài lớn hơn 3 ký tự.

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static void main(String[] args){
        List <String> danhSachTen = new ArrayList<>();
        danhSachTen.add("Alice");
        danhSachTen.add("Tom");
        danhSachTen.add("Annie");
        danhSachTen.add("James");
        danhSachTen.add("Lyn");

        long danhSachTenDaLoc = danhSachTen.stream()
                .filter(n -> n.length() > 3)
                .count();
        System.out.println("Danh sách chuỗi có độ dài lớn hơn 3 ký tự: " + danhSachTenDaLoc);
    }
}
