package Baitapbuoi3;
// trên 5 trung bình trên 7 khá trên 9 giỏi
public class SinhVien {
    String ten;
    int nam;
    double diem;

    SinhVien(String ten, int nam, double diem){
        this.ten = ten;
        this.nam = nam;
        this.diem = diem;
    }
    public String xepLoai ()  {
        if (diem > 9){
            return "Giỏi";
        } else if (diem  > 7){
            return "Khá";
        } else {
            return "Trung Bình";
        }
    }
    public int tinhTuoi(){
        int nam_hien_tai = 2025;
        int tuoi = nam_hien_tai - nam;
        return tuoi;
    }
}


