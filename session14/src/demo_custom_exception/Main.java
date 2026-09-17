package demo_custom_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 số bất kỳ từ 10 đến 50");
        try {
            int result = inputNumber(sc);
            System.out.println(result);
        } catch (InValidDataException e) {
            System.err.println(e.getMessage());
        }
    }

    // Nhập số từ 10 -> 50 ngoài khoảng sẽ ném lỗi
    public static int inputNumber(Scanner sc) throws InValidDataException {
        do {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number < 10 || number > 50) {
                    throw new InValidDataException("Vượt quá phạm vi rồi");
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu phải nhập số");
            }
        } while (true);

    }

}
