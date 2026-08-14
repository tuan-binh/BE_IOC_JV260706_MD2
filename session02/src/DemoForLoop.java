public class DemoForLoop {
    public static void main(String[] args) {

        for (int i = 1;; i = i + 1) {
            System.out.println("i = " + i);
            System.out.println("Anh xin lỗi, tất cả lỗi tại anh");
        }

        // Lưu ý: nếu như thiếu điều kiện hoặc biến updation là có thể xảy ra vòng lặp vô hạn

    }
}
