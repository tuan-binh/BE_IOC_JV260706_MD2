package exercise;

public class PartTime extends Employee {
    private double range = 30000;
    private double hourwork;

    // Constructor

    public PartTime() {
    }

    public PartTime(String name, int age, String department, double range, double hourwork) {
        super(name, age, department);
        this.range = range;
        this.hourwork = hourwork;
    }

    // Getter / Setter

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getHourwork() {
        return hourwork;
    }

    public void setHourwork(double hourwork) {
        this.hourwork = hourwork;
    }


    // Phương thức tính lương
    public double calculateSalary() {
        return hourwork * range;
    }

}
