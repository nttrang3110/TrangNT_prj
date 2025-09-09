package BaiTapVN;

public abstract class Employee extends Person {
    private int employeeId;

    //Constructor
    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
    //Getter&Setter
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    //Double calculateSalary
    public abstract double calculateSalary();

    //displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + this.employeeId);
    }
}


