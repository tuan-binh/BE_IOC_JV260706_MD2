import java.util.Scanner;

public class DemoIO {
    public static void main(String[] args) {
        // Khởi tạo đối tượng để có thể nhập từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Câu dẫn để người dùng nhìn vào có thể biết mình phải nhập gì
        System.out.println("Nhập vào tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("name = " + name);

        System.out.println("Nhập vào tuổi của bạn: ");
//        int age = sc.nextInt(); // lý do là ở đây đang bị lưu lại 1 nút enter
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("age = " + age);

        // C1: sử dụng thêm nextLine
//        sc.nextLine();

        // C2: thay vì phải dùng nextInt() --> nhập chuỗi (nextLine) sau đó ép kiểu về

        System.out.println("Nhập vào địa chỉ của bạn: ");
        String address = sc.nextLine();

        System.out.println("address = " + address);

        System.out.print("Nguyễn Văn A");
        System.out.print("Trần Thị B");
    }
}
