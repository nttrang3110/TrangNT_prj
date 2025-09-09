package Baitapbuoi4;

public class Person {
    protected String name;
    protected int age;
    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Getter&Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //displayInfo
    public void displayInfo(){
        System.out.println("Tên: " + this.name + "," + "Tuổi: " + this.age);
    }
}
