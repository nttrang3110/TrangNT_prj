package Baitapbuoi4;

public class PersonMain {
    public static void main(String[] args) {
        //Create new
        Employee e1 = new Employee("Trần Thị B", 50, 26876, 70000);
        //DisplayInfo
        e1.displayInfo();
        //CalculateAnnualSalary
        System.out.println(e1.calculateaAnnualSalary());
        //ApplyRaise
        e1.setSalary(80000);
        e1.applyRaise(10);
        e1.displayInfo();
        //IsRetirementAge
        if (e1.isRetirementAge() == true) {
            System.out.println("Đã đến tuổi nghỉ hưu");
        } else {
            System.out.println("Chưa đến tuổi nghỉ hưu");
        }
    }
}

