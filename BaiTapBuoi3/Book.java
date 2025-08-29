package Baitapbuoi3;

public class Book {
        String title;
        String author;
        double price;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void showInfo(){
        System.out.println("Thong tin sach: " + title + " - " + author  +  " - " + price);
    }
}
