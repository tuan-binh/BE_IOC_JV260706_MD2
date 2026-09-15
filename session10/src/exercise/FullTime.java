package exercise;

public class FullTime extends Employee {
    public double range = 50000;

    private final int HOUR_WORK = 8;

    // constructor

    public FullTime() {
    }

    public FullTime(String name, int age, String department, double range) {
        super(name, age, department);
        this.range = range;
    }

    // getter / setter

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public int getHourWork() {
        return HOUR_WORK;
    }

    // phương thức tính lương
    public double calculateSalary() {
        return HOUR_WORK * range;
    }

}
