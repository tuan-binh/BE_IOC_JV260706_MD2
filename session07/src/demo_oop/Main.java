package demo_oop;

public class Main {
    public static void main(String[] args) {

        Person dang = new Person();
        dang.name = "Nguyễn Hải Đăng";
        dang.age = 18;
        dang.address = "Hà Nội";

        System.out.println(dang.name);
        System.out.println(dang.age);
        System.out.println(dang.address);

//        Person son = new Person("Bùi Hùng Sơn",18,"Hà Nội");
//        System.out.println(son.name);
//        System.out.println(son.age);
//        System.out.println(son.address);

        /*
        Khai báo 1 lớp Rectangle
        có 2 thông tin về nó là chiều dài và chiều rộng
        có thêm 1 phương thức tính chu vi và diện tích và thực hiện logic và hiển thị ra màn hình
        Khởi tạo đối tượng với thông tin nhập vào và in ra kết quả chu vi và diện tích
        */

    }
}
