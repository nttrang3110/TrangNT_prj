package Baitapbuoi13;

import java.util.ArrayList;
import java.util.List;

//Bài 5: Tính tổng các phần tử
//Cho danh sách các số nguyên.
// Hãy dùng reduce() để tính tổng của tất cả các phần tử.

public class Bai5 {
    public static void main(String[] args){
        List<Integer> danhSachSoNguyen = new ArrayList<>();
        danhSachSoNguyen.add(1);
        danhSachSoNguyen.add(3);
        danhSachSoNguyen.add(5);
        danhSachSoNguyen.add(7);
        danhSachSoNguyen.add(9);

        int sum = danhSachSoNguyen.stream().reduce(0,(a, b) -> a + b);
        System.out.println("Tổng của tất cả các phần tử: " + sum);
    }
}
