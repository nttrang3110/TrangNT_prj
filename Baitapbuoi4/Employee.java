package Baitapbuoi4;

    public class Employee extends Person {
        private int employeeId;
        private double salary;

    //Constructor
    public Employee(String name, int age, int employee, double salary) {
        super(name, age);
        this.employeeId = employee;
        this.salary = salary;
    }

    //Getter&Setter
    public int getEmployee() {
        return employeeId;
    }

    public void setEmployee(int employee) {
        this.employeeId = employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //displayInfo
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("ID: " + this.employeeId + "," + "Lương: " + this.salary);
        }

    //calculateAnnualSalary
    public double calculateaAnnualSalary() {
        return this.salary * 12;
    }
    //applyRaise
    public void applyRaise(double percent) {
        setSalary(this.salary + this.salary * percent / 100);
    }
    //isRetirementAge
    public boolean isRetirementAge() {
        if (this.age >= 60) {
            return true;
        }
        else{
            return false;
        }
    }
}


