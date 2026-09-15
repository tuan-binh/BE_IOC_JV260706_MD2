package btth;

public class FullTimeEmployee extends Employee {
    private double rate;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, String department, double rate) {
        super(name, department);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calSalary() {
        return rate * 8;
    }

    @Override
    public void displayInfo() {
        System.out.println("Full Time Employee");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Rate: " + rate);
        System.out.println("Salary: " + calSalary());
    }
}
