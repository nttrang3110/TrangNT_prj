package BaiTapBuoi5;

public class Book extends Document {
    private String author;
    private int year;
//Constructor
    public Book(int id, String name, String author, int year) {
        super(id, name);
        this.author = author;
        this.year = year;
    }
//Getter&Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", year=" + year +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

