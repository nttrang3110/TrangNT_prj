package BaiTapBuoi3;
public class SinhVienMain {
    public static void main(String[] args) {
       SinhVien s1 = new SinhVien("Nguyễn A",2003,8);
       System.out.println(s1.xepLoai());
       System.out.println(s1.tinhTuoi());
       SinhVien s2 = new SinhVien("Trần B",2004,9.5);
       System.out.println(s2.xepLoai());
       System.out.println(s2.tinhTuoi());
       SinhVien s3 = new SinhVien("Phạm C",2002,4.5);
       System.out.println(s3.xepLoai());
       System.out.println(s3.tinhTuoi());
    }
    }



