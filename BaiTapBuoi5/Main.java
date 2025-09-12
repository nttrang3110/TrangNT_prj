package BaiTapBuoi5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //Create list
        List<Student> student = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Run function menu
        do {
            System.out.println("<<Lựa chọn chức năng>>");
            System.out.println("------------------------");
            System.out.println(" 1. Thêm sinh viên ");
            System.out.println(" 2. Hiển thị sinh viên ");
            System.out.println(" 3. Xoá sinh viên ");
            System.out.println(" 4. Sửa điểm ");
            System.out.println(" 5. Thoát ");
            System.out.println("------------------------");
            System.out.println(" Hãy lựa chọn chức năng:  ");
            // Choose function
            int a = scanner.nextInt();
            switch (a) {
                //Insert info
                case 1:
                    System.out.println("<<Nhập thông tin sinh viên>>");
                    System.out.println("Nhập mã sinh viên: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Nhập tên sinh viên ");
                    String name = scanner.nextLine();

                    System.out.println("Nhập điểm của sinh viên: ");
                    double score = scanner.nextDouble();

                    Student st = new Student(id,name,score);
                    student.add(st);

                    System.out.println("Lưu thông tin sinh viên thành công!");
                    break;
                //Display info
                case 2:
                    for (Student i  : student)
                        System.out.println("Thông tin sinh viên: " + i);
                    break;
                //Delete info
                case 3:
                    System.out.println("Nhập mã sinh viên: ");
                    int msv = scanner.nextInt();
                    for (int k = 0; k < student.size(); k++){
                        if (student.get(k).getId() == msv){
                            student.remove(k);
                            break;
                        }
                        }
                    System.out.println("Xoá thông tin sinh viên thành công");
                    break;
                // Update score
                case 4:
                    System.out.println("Nhập mã sinh viên: ");
                    int ID = scanner.nextInt();
                    for (int u = 0; u < student.size(); u++){
                        if (student.get(u).getId() == ID){
                            System.out.println("Nhập điểm mới: ");
                            double newScore = scanner.nextDouble();
                            student.get(u).setScore(newScore);
                        }
                    }
                    System.out.println("Sửa điểm sinh viên thành công");
                    break;
                // Out menu
                case 5:
                    System.out.println("Thoát");
                    System.exit(0);
                }
        }
        while (true);
    }
}

