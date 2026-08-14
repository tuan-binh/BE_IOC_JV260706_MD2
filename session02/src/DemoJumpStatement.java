public class DemoJumpStatement {
    public static void main(String[] args) {
        // BÀI TOÁN tìm số đầu tiên mà từ 1 -> 20 mà chia hết cho cả 3 và 5

        // GIÁI PHÁP: Dùng FOR

        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Số " + i + " chia hết cho cả 3 và 5");
                break;
            }
        }

        // Continue
        // BÀI TOÁN: Hiển thị ra những số chẵn từ 1 -> 10 mà phải sử dụng continue

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        // BÀI TOÁN:
        /**
         * BÀI TOÁN:
         * Nhập vào 1 số và kiểm tra nó có phải là số nguyên tố hay không
         * Số nguyên tố là như thế nào? --> số chỉ chia hết cho 1 và chính nó (chỉ có 2 ước này thôi)
         *
         * */

    }
}
