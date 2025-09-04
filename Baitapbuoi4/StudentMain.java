package Baitapbuoi4;

public class StudentMain {
    public static void main(String[] args) {
        //Create
        Student st1 = new Student(21041499, "Nguyễn Thị A", 8.5);
        //Read
        System.out.println(st1);
        //Update
        st1.setScore(9.5);
        System.out.println("Điểm mới: " + st1.getScore());
        //Delete
        st1.reset();
        System.out.println(st1);
    }
}
