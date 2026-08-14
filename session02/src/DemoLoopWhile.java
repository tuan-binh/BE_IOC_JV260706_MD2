import java.util.Scanner;

public class DemoLoopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BÀI TOÁN: Nhập 1 số bắt buộc nằm trong từ 10 -> 20 không đúng thì nhập lại

//        System.out.println("Nhập vào 1 số bất kỳ");
//        int number = Integer.parseInt(sc.nextLine());
//
//        while (number < 10 || number > 20) {
//            System.out.println("Nhập lại cho tôi");
//            number = Integer.parseInt(sc.nextLine());
//        }
//
//        System.out.println("Giá trị vừa nhập là " + number);

        // DO WHILE

        /*
        do {

        } while (condition);

        Yêu cầu nhập giá tiền phải lớn hơn 0 sai thì yêu cầu nhập lại

        */
        double price;
        do {

            System.out.println("Nhập vào giá tiền: ");
            price = Double.parseDouble(sc.nextLine());

        } while (price <= 0);

        System.out.println("Giá tiền = " + price);

    }
}
