import java.util.Scanner;

public class DemoSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BÀI TOÁN:
        /**
         * Nhập vào 1 số từ 2->8
         * Hiển thị ra thứ trong tuần tương ứng
         * Ví Dụ: 2 -> Thứ Hai
         * 3 -> Thủ Ba
         * 8 -> Chủ Nhật
         * */

        // Input: Nhập vào số từ 2 - 8
        // Output: Hiển thị thứ mấy
        // Giải pháp: Switch case
//        System.out.println("Nhập vào số trong tuần: ");
//        int numberOfWeek = Integer.parseInt(sc.nextLine());
//
//        switch (numberOfWeek) {
//            case 2:
//                System.out.println("Thứ Hai");
//                break;
//            case 3:
//                System.out.println("Thứ Ba");
//                break;
//            case 4:
//                System.out.println("Thứ Tư");
//                break;
//            case 5:
//                System.out.println("Thứ Năm");
//                break;
//            case 6:
//                System.out.println("Thứ Sáu");
//                break;
//            case 7:
//                System.out.println("Thứ Bảy");
//                break;
//            case 8:
//                System.out.println("Chủ Nhật");
//                break;
//            default:
//                System.err.println("Vui lòng nhập lại từ 2 đến 8");
//        }


        // BÀI TOÁN:
        /**
         * Nhập vào tháng bất kỳ trong năm
         * Hiển thị ra số ngày trong tháng đó
         * */

        System.out.println("Nhập vào tháng muốn kiểm tra: ");
        int month = Integer.parseInt(sc.nextLine());

        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 4,6,9,11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.err.println("Vui lòng nhập lại từ 1 -> 12");
        }

    }
}
