package BaiTapBuoi5;

public class Document {
    protected int id;
    protected String name;
    //Constructor
    public Document(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //Getter&Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
