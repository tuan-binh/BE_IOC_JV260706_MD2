import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // Nhập vào 2 số start và and và hiển thị các số nguyên tố nằm trong từ start và and và tổng có bn số nguyên tố

        // input: start end
        // Output: các số nguyên tố, và số lượng số nguyên tố nằm trong start và end

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số bắt đầu: ");
        int start = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số kết thúc: ");
        int end = Integer.parseInt(sc.nextLine());

        // TH: end > start thì giải quyết như nào?

        // 1. bắt người dùng nhập lại

        // 2. đảo vị trí

        if (end < start) {
            int temp = start;
            start = end;
            end = temp;
        }

        // Duyệt từ start cho đến end để kiểm tra
        int count = 0;
        System.out.println("Danh sách số nguyên tố: ");
        for (int i = start; i <= end; i++) {

            boolean isPrime = true;

            // Kiểm tra có phải số nguyên tố hay không
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                System.out.println(i);
            }

        }

        System.out.println("Số lượng số nguyên tố là " + count);

    }
}
