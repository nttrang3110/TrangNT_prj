package Baitapbuoi3;

import java.util.Scanner;

public class Student {
    int maHS;
    String tenHS;
    int tuoi;
    double diemToan;
    double diemLy;
    double diemHoa;

    public Student() {
    }
    public Student(int maHS, String tenHS, int tuoi, double diemToan, double diemLy, double diemHoa) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
   public void nhapThongTin() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap thong tin hoc sinh");

       System.out.print("Nhap ma HS: ");
       this.maHS = scanner.nextInt();
       scanner.nextLine(); // bỏ Enter

       System.out.print("Nhap ten HS: ");
       this.tenHS = scanner.nextLine();

       System.out.print("Nhap tuoi: ");
       this.tuoi = scanner.nextInt();

       System.out.print("Nhap diem Toan: ");
       this.diemToan = scanner.nextDouble();

       System.out.print("Nhap diem Ly: ");
       this.diemLy = scanner.nextDouble();

       System.out.print("Nhap diem Hoa: ");
       this.diemHoa = scanner.nextDouble();
   }

    public void hienThongtin(){
        System.out.println("Thong tin hoc sinh: " + this.tenHS + " - " + "Ma HS:"  + this.maHS+ " - " + "Tuoi:" + this.tuoi);
    }

    public double tinhDiemTrungBinh(){
        return (this.diemToan + this.diemLy + this.diemHoa) / 3;
    }

    public String xepLoai(){
        double dtb = tinhDiemTrungBinh();
        if (dtb >= 8) {
            return "Xep loai Gioi";
        } else if (dtb >= 6.5){
            return "Xep loai Kha";
        } else if (dtb >= 5){
            return "Xep loai Trung Binh";
        } else{
            return "Xep loai Yeu";
        }
    }
}

