package btth;

public class Main {
    public static void main(String[] args) {
        Employee fulltime = new FullTimeEmployee("Bùi Hùng Sơn", "IT Helpdeck",150000.0);

        Employee parttime = new PartTimeEmployee("Nguyễn Huy Khánh","DevOps",100000.0,4);

        fulltime.displayInfo();
        parttime.displayInfo();
    }
}
