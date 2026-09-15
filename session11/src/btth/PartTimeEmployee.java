package btth;

public class PartTimeEmployee extends Employee {
    protected double rate;
    protected int hours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, String department, double rate, int hours) {
        super(name, department);
        this.rate = rate;
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calSalary() {
        return hours * rate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Part Time Employee");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Rate: " + rate);
        System.out.println("Hours: " + hours);
        System.out.println("Salary: " + calSalary());
    }
}
