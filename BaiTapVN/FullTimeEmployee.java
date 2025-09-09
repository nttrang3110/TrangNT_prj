package BaiTapVN;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;
    //Constructor

    public FullTimeEmployee(String name, int age, int employeeId, double monthlySalary) {
        super(name, age, employeeId);
        this.monthlySalary = monthlySalary;
    }

    //Getter&Setter
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    //CalculateSalary
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
    //displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Fulltime Employee");
        System.out.println("Monthly Salary: " + this.monthlySalary);
    }
}
