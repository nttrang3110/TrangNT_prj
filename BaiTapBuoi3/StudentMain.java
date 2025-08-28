package BaiTapBuoi3;

public class StudentMain {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.nhapThongTin();
        s1.hienThongtin();
        System.out.println("Diem trung binh: " + s1.tinhDiemTrungBinh());
        System.out.println("Xep loai: " + s1.xepLoai());
    }
}
