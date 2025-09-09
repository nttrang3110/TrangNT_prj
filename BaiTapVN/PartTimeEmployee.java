package BaiTapVN;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    //Constructor
    public PartTimeEmployee(String name, int age, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, age, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    //Getter&Setter
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //CalculateSalary
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    //displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Part-time Employee");
        System.out.println("Working Hours: " + this.hoursWorked);
        System.out.println("Hourly Salary: " + calculateSalary());
    }
}
