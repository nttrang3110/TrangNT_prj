package Baitapbuoi3;
public class BookMain {
        public static void main(String[] args) {
            Book b1 = new Book("Java", " Nguyễn Văn A", 150000);
            b1.showInfo();
            Book b2 = new Book("Java OOP", "Trần Thị B", 200000);
            b2.showInfo();
            Book b3 = new Book("Python", "Phạm Văn C", 250000);
            b3.showInfo();
        }
    }
