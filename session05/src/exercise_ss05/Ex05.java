package exercise_ss05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {
        // Mục tiêu lấy ra các số có tối thiếu 4 chữ số sau đó tính tống
        // (chắc chắn phải là số tiền) - Báo cáo tài chính

        Scanner sc = new Scanner(System.in);

        String regex = "\\b\\d{4,}\\b";

        System.out.println("Nhập vào báo cáo tài chính: ");
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        double total = 0;

        while (matcher.find()) {
            String value = matcher.group();

            total += Double.parseDouble(value);

        }

        System.out.println("Tổng tiền là " + total);


    }
}
