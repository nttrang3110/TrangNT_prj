package Baitapbuoi13;


import java.util.ArrayList;
import java.util.List;

//Bài 1: Lọc số chẵn
//Cho danh sách các số nguyên.
// Hãy lọc ra các số chẵn bằng Stream API.
public class Bai1 {
    public static void main(String[] args) {
        List<Integer> danhSachSoNguyen = new ArrayList<>();
        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(11);
        danhSachSoNguyen.add(12);
        danhSachSoNguyen.add(13);
        danhSachSoNguyen.add(14);

        List<Integer> danhSachSoChan = danhSachSoNguyen.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Danh sách số chẵn:" + danhSachSoChan);
    }
    }

