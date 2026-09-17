package demo_unchecked_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Unchecked Exception - Runtime - Chạy trường trình thì mới có thể xảy ra lỗi
//        int a = 1;
//        int b = 0;
//
//        int c = a / b;
//        System.out.println(c);

        // Nhập thông tin số nhưng mà cố tình nhập chuỗi
        try {
        inputNumber();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Đã vào finally");
        }

//        System.out.println("Đoạn dưới vẫn chạy");

        /*
            Tạo 1 class person {
                id : string (SVxxx) - 3 ký tự cuối phải là số
                name : string - không được bỏ trống
                age : int nhập số (>= 18)
                dateOfBirht : Date (gợi ý: sử dụng SimplaDateFormat để ép kiểu)

                Tất cả các trường phải xử lý là nếu nhập sai thì yêu cầu nhập lại
                Yêu cầu nhập thông tin 1 đối tượng và in ra
            }
        */

        // BÀI TOÁN XỬ LÝ NGOẠI LỆ TRY CATCH

    }

    public static void inputNumber() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        try {
            // Khói để có thể xảy ra được ngoại lệ
            int number = Integer.parseInt(sc.nextLine());
            System.out.println(number);

            // Exception là cha của tất cả ngoại - nhưng sẽ chậm hơn khi bắt chính xác
            //
        } catch (NumberFormatException e) {
            // Catch xử lý ngoại lệ (lưới bắt lỗi)
            throw new Exception("Số không đúng định dạng");
        }
    }


}
