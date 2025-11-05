package Baitapbuoi13.Bai678;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Person> danhSachNguoi = new ArrayList<>();
        danhSachNguoi.add(new Person("Nguyen Van A", 20));
        danhSachNguoi.add(new Person("Tran Van B", 18));
        danhSachNguoi.add(new Person("Pham Thi C", 25));
        danhSachNguoi.add(new Person("Nguyen Thi D", 21));
        danhSachNguoi.add(new Person("Le Van E", 19));

        //Bài 6:  Làm việc với đối tượng Person
        //Lọc ra những người có tuổi ≥ 20.
        //Lấy danh sách tên của những người đó.
        //Sắp xếp theo tuổi giảm dần.
        List<String> danhSachNguoiHon20 = danhSachNguoi.stream()
                .filter(n -> n.getAge() > 20)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(Person::getName)
                .toList();
        System.out.println("Danh sách người lớn hơn bằng 20 tuổi: " + danhSachNguoiHon20);
        System.out.println("------------------------------------");

        //Bai 7:
        //Có ai nhỏ hơn 18 tuổi không?
        //Tất cả mọi người có trên 15 tuổi không?
        boolean checkTuoi1 = danhSachNguoi.stream()
                .anyMatch(n -> n.getAge() < 18);
        boolean checkTuoi2 = danhSachNguoi.stream()
                .allMatch(n -> n.getAge() >15);
        System.out.println("Có ai nhỏ hơn 18 tuổi không? " + checkTuoi1);
        System.out.println("Tất cả mọi người đều trên 15 tuổi? "+ checkTuoi2);
        System.out.println("------------------------------------");

        //Bài 8: Nối chuỗi
        //Cho danh sách các chuỗi (tên).
        // Hãy nối tất cả tên lại thành một chuỗi duy nhất, ngăn cách bởi dấu phẩy (,).
        String noiChuoi = danhSachNguoi.stream()
                .map(n -> n.getName())
                .collect(Collectors.joining(" , "));
        System.out.println("Chuỗi tên được nối: " + noiChuoi);
    }
}
