package exercise;

public class Main {
    public static void main(String[] args) {
        FullTime khanh = new FullTime("Khánh", 18, "IT", 50000);
        System.out.println("Lương một ngày của khánh = " + khanh.calculateSalary());

        PartTime dang = new PartTime("Đăng", 20, "Marketing", 30000, 4);
        System.out.println("Lương một ngày của đăng = " + dang.calculateSalary());
    }
}