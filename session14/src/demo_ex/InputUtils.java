package demo_ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputUtils {

    // Khai báo về biến nhập thông tin
    public static final Scanner sc = new Scanner(System.in);

    // Nhập chuỗi
    public static String getString() {
        do {
            String value = sc.nextLine();
            if (value.isBlank()) {
                System.err.println("Vui lòng không được bỏ trống");
            } else {
                return value;
            }
        } while (true);
    }

    // Nhập số nguyên - int
    public static int getInt() {
        do {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập lại số");
            }
        } while (true);
    }

    public static Date getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        do {
            String value = getString();

            try {
                return sdf.parse(value);
            } catch (ParseException e) {
                System.err.println("Vui lòng nhập đúng định dạng dd/MM/yyyy");
            }
        } while (true);
    }

}
