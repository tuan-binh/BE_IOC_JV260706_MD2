package validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Kiểm tra cho thầy giá trị nhập vào phải có định dạng là id S001
        // Quy tắc: Phải có chữ S và 3 ký số đằng sau

        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String input = sc.nextLine();

        String regex = "S[0-9]{3}";

//        Pattern pattern = Pattern.compile(regex);
//
//        Matcher matcher = pattern.matcher(input);

        System.out.println("Kết quả kiểm tra là "+input.matches(regex));

        // ====== REGEX ======
        // BÀI TOÁN: Yêu cầu người dùng nhập vào 1 ký tự bất kỳ kiểm tra xem có thỏa mãn như sau:
        // Ký tự A001 hoặc B002 hoặc C003
        // nó tồn tại A hoặc B hoặc C ở đầu và 3 số đằng sau
        // sai thì yêu cầu nhập lại

//        String regexId = "[ABC]\\d{3}";
//
//        Pattern patternId = Pattern.compile(regexId);
//
//
//
//        do {
//            Matcher matcherId = patternId.matcher(input);
//            if(matcherId.matches()) {
//                System.out.println("Kết quả kiểm tra id là "+matcherId.matches());
//                break;
//            } else {
//                System.err.println("Sai định dạng phải chứa ký tự A | B | C và 3 số đằng sau: ");
//                input = sc.nextLine();
//            }
//
//        } while (true);





    }
}
