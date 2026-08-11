public class DemoOperator {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;

        int result = firstNumber + secondNumber;
        System.out.println("result = " + result);

        boolean gender = true;
        // Bài toán là hiển thị khi gender = true thì là nam , còn false là nữ

        System.out.println(gender == true ? "Nam" : "Nữ");

        /**
         * Khai báo 2 biến có giá trị của chiều dài và chiều rộng
         * Tính toán chu vi và diện tích hình chữ nhật
         * Chu vi = ( dài + rộng ) * 2
         * Diện tích = dài * rộng
         *
         * --> Hiển thị kết quả ra màn hình
         * */

        double width = 5.5;
        double height = 10.0;

        double perimeter = (width + height) * 2;
        double area = width * height;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
