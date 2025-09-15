package BaiTapBuoi5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentMain {
    public static void main(String[] args) {
        //Create list
        List<Document> document = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Run function menu
        do {
            System.out.println("<<Lựa chọn chức năng>>");
            System.out.println("------------------------");
            System.out.println(" 1. Thêm sách ");
            System.out.println(" 2. Thêm tạp chí");
            System.out.println(" 3. Xoá tài liệu theo ID ");
            System.out.println(" 4. Tìm kiếm tài liệu theo tên ");
            System.out.println(" 5. Hiển thị tất cả tài liệu ");
            System.out.println(" 0. Thoát chương trình ");
            System.out.println("------------------------");
            System.out.println(" Hãy lựa chọn chức năng:  ");

            int a = scanner.nextInt();
            scanner.nextLine();
            switch(a){
                case 1: //Thêm sách
                    System.out.println("Nhập thông tin sách: ");
                    System.out.println("Nhập ID sách: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên sách: ");
                    String name1 = scanner.nextLine();
                    System.out.println("Nhập tên tác giả: ");
                    String author1 = scanner.nextLine();
                    System.out.println("Nhập năm xuất bản: ");
                    int year1 = scanner.nextInt();

                    Book b1 = new Book(id1,name1,author1,year1);
                    document.add(b1);

                    System.out.println("Lưu thông tin thành công!");
                    break;
                case 2: //Thêm tạp chí
                    System.out.println("Nhập thông tin tạp chí: ");
                    System.out.println("Nhập ID tạp chí: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên tạp chí: ");
                    String name2 = scanner.nextLine();
                    System.out.println("Nhập số tạp chí: ");
                    int number2 = scanner.nextInt();
                    System.out.println("Nhập tháng xuất bản: ");
                    int month2 = scanner.nextInt();

                    Magazine m2 = new Magazine(id2,name2,number2,month2);
                    document.add(m2);

                    System.out.println("Lưu thông tin thành công!");
                    break;

                case 3: //Xóa tài liệu theo ID
                    System.out.println("Nhập id tài liệu muốn xóa: ");
                    int idXoa = scanner.nextInt();
                    for (int i = 0; i < document.size(); i++){
                        if (document.get(i).getId() == idXoa){
                            document.remove(i);
                            break;
                        }
                    }
                    System.out.println("Xoá thông tin thành công");
                    break;
                case 4: // Tìm kiếm tài liệu theo tên
                    System.out.println("Nhập tên tài liệu muốn tìm: ");
                    String nameSearch = scanner.nextLine();
//                    System.out.println(nameSearch);
                    for (int k = 0; k < document.size(); k++){
//                    System.out.println(document.get(k).getName().trim().equals(nameSearch.trim()));
                        if (document.get(k).getName().trim().equals(nameSearch.trim())){
                            System.out.println(document.get(k));
                        }
                    }
                    break;
                case 5: //Hiển thị thông tin
                    for (Document d : document)
                        System.out.println("Thông tin tài liệu: " + d);
                    break;
                case 0: //Thoát
                    System.out.println("Thoát chương trình");
                    System.exit(0);
            }
        }
        while (true);
    }
}
