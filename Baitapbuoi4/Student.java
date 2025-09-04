package Baitapbuoi4;

public class Student {
    private int id;
    private String name;
    private double score;
    //Constructor
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    //Setter & Getter
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //DisplayInfo
    @Override
    public String toString() {
        return "Student{" + "ID: " + id + ", Họ và tên: " + name + " " + ", Điểm: " + score + '}';
    }
    //Reset
    public void reset(){
        this.id = 0;
        this.name = "";
        this.score = 0;
    }
}

