package BaiTapVN;

public class Main {
    public static void main(String[] args) {
        //Full-time
       Employee nv1 = new FullTimeEmployee("Nguyen Thi An", 40, 34576, 7000000);
       nv1.calculateSalary();
       nv1.displayInfo();
        //Part-time
       Employee nv2 = new PartTimeEmployee("Pham Van B", 50, 34676,200000,6);
       nv2.calculateSalary();
       nv2.displayInfo();

    }
}
