import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Em đã đủ mười 18 chưa
        Scanner sc = new Scanner(System.in);

//        System.out.println("Nhập vào tuổi của bạn: ");
//        int age = Integer.parseInt(sc.nextLine());

        // Mệnh đề IF
        // Cú pháp
//        if (condition - biểu thức điều kiện) {
//            phần thân để thực thi
//        }
        // Mệnh đề IF ELSE
//        if (condition - biểu thức điều kiện - phải là biểu thức đúng) {
//            phần thân để thực thi
//        } else {
//             thân phần else
//        }

//        if(age >= 18) {
//            System.out.println("Đã trưởng thành");
//        } else {
//            System.out.println("Đang là thiếu niên");
//        }


        // BÀI TOÁN:
        /**
         * Hiển thị ra số phần trăm được giảm giá khi mua hàng
         * khi mua trên 200 - 500 thì được giảm - 5%
         * Khi mua trên 500 - 1000 thì được giảm - 10%
         * Khi mua trên 1000 - 2000 thì được giảm 15%
         * Còn lại là ko có mã giảm giá
         * */

        /**
         * Đầu vào là nhập tiền đã mua
         * // Sử dụng gì IF ELSE IF
         * Cú pháp:
         * if () {
         *
         * } else if () {
         *
         * } else {
         *
         * }
         *
         * Lưu ý: có thể sẽ chứa nhiều thêm else if nữa
         * */

//        System.out.println("Nhập vào giá tiền đã mua: ");
//        double pay = Double.parseDouble(sc.nextLine());
//
//        if (pay >= 200000 && pay < 500000) {
//            System.out.println("Có mã giảm giá 5%");
//            // Hiển thị số tiền sau khi được giảm
//            System.out.println("total = " + (pay * 0.95));
//        } else if (pay < 1000000) {
//            System.out.println("Có mã giảm giá 10%");
//            System.out.println("total = " + (pay * 0.9));
//        } else if (pay < 2000000) {
//            System.out.println("Có mã giảm giá 15%");
//            System.out.println("total = "+ (pay * 0.85));
//        } else {
//            System.err.println("Giá mua không đủ điều kiện để giảm giá");
//        }

        // Mệnh đề IF LỒNG NHAU --> NESTED IF
        // Kiểm tra xem rpoint (>= 70) đủ điều kiện không sau đó kiểm tra điểm thi (>= 50) có qua môn hay không
        // Input: Rpoint và Score

        // NESTED IF

//        System.out.println("Nhập vào Rpoint của bạn: ");
//        double rpoint = Double.parseDouble(sc.nextLine());
//
//
//
//        if (rpoint >= 70) {
//            System.out.println("Nhập vào điểm thi: ");
//            double score = Double.parseDouble(sc.nextLine());
//            // phần thân
//            if (score >= 50) {
//                System.out.println("Đã đủ điểm qua môn");
//            } else {
//                System.err.println("Không đủ điểm qua môn");
//            }
//        } else {
//            System.err.println("Không đủ điều kiện thi");
//        }


        // BÀI TOÁN:
        /**
         * Con người: Đi xe bus
         * người dưới 10 tuổi thì free
         * Người từ 10 - 18 tuổi 5000
         * Người từ 18 - 60 tuỏi 10000
         * Người trên 60 tuổi thì free
         *
         * Yêu cầu là nhập vào tuổi và hiển thị ra giá tiền phải trả
         * */

        // Input: age
        // Output: Hiển thị giá tiền
        // Giải pháp: IF ELSE IF

        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        if (age > 10 && age < 18) {
            System.out.println("Giá tiền phải trả là 5000 VNĐ");
        } else if (age >= 18 && age < 60) {
            System.out.println("Giá tiền phải trả là 10000 VNĐ");
        } else {
            System.out.println("Miễn phí");
        }




    }
}