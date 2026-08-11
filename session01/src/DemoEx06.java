import java.util.Scanner;

public class DemoEx06 {
    public static void main(String[] args) {
        // Gross Salary = (workingHours * hourlyRate) + phụ cấp

        // Net Salary = Gross Salary - Các khoản khấu trừ

        // Khấu trừ
        /**
         * BHXH = Lương cơ bản * 8%
         * BHYT = Lương cơ bản * 1.5%
         * BHTN = Lương cơ bản * 1%
         * Phí công đoàn 150.000
         * */

        // Nhập thông tin gồm: mã nhân viên, tên nhân viên, số giờ làm việc, lương theo giờ, phụ cấp
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã nhân viên: ");
        String employeeId = sc.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        String employeeName = sc.nextLine();
        System.out.println("Nhập vào số giờ làm việc: ");
        double hoursWorked = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lương theo giờ: ");
        double hourlyRate = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào phụ cấp: ");
        double allowance = Double.parseDouble(sc.nextLine());

        // Tính lương cơ bản
        double baseSalary = hoursWorked * hourlyRate;
        // Tính lương Gross
        double grossSalary = baseSalary + allowance;
        // Tính các thông số về khấu trừ
        final double BHXH = 0.08;
        final double BHYT = 0.015;
        final double BHTN = 0.01;
        final double PCD = 150000;

        // Tính tổng khấu trừ
        double totalDeduction = baseSalary * BHXH + baseSalary * BHYT + baseSalary * BHTN + PCD;

        // Tính tiền thực nhân là net salary
        double netSalary = grossSalary - totalDeduction;

        System.out.printf("""
                +-------------------------------------------------------------------+
                |               PHIẾU LƯƠNG NHÂN VIÊN (PAYROLL SLIP)                |
                +-------------------------------------------------------------------+
                | Mã nhân viên   : %-30s                                   |
                | Họ và tên      : %s                                            |
                | Số giờ làm việc: %f giờ  | Lương giờ:         %f VNĐ          |
                +-------------------------------------------------------------------+
                | I. THU NHẬP (EARNINGS)                                            |
                | - Lương cơ bản theo giờ               :        %f VNĐ           |
                | - Phụ cấp cố định                     :         %f VNĐ          |
                | -> TỔNG THU NHẬP GỘP (GROSS)          :        %f VNĐ           |
                +-------------------------------------------------------------------+
                | II. KHẤU TRỪ BẢO HIỂM & ĐOÀN PHÍ (DEDUCTIONS)                     |
                | - BHXH (8.0%%)                         :         %f VNĐ          |
                | - BHYT (1.5%%)                         :           %f VNĐ        |
                | - BHTN (1.0%%)                         :           %f VNĐ        |
                | - Đoàn phí Công đoàn (Cố định)        :           %f VNĐ        |
                | -> TỔNG KHẤU TRỪ                      :         %f VNĐ          |
                +-------------------------------------------------------------------+
                | III. THỰC NHẬN (NET PAY)                                          |
                | -> LƯƠNG THỰC NHẬN CUỐI CÙNG          :        %f VNĐ           |
                +-------------------------------------------------------------------+
                """,
                employeeId,
                employeeName,
                hoursWorked,
                hourlyRate,
                baseSalary,
                allowance,
                grossSalary,
                (baseSalary * BHXH),
                (baseSalary * BHYT),
                (baseSalary * BHTN),
                PCD,
                totalDeduction,
                netSalary
        );
    }
}
