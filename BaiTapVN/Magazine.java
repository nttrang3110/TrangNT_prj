package BaiTapBuoi5;

public class Magazine extends Document {
    private int number;
    private int month;
    //Constructor
    public Magazine(int id, String name, int number, int month) {
        super(id, name);
        this.number = number;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "number=" + number +
                ", month=" + month +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
