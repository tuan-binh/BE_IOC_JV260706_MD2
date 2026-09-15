package other_package;

import inheritence.Parent;

public class Child extends Parent {

    private int age;

    public Child() {
    }

    public Child(String name, String address, int age) {
        super(name, address); // Nó sẽ đại diện cho constructor của lớp cha
        this.age = age;
    }

    // Từ khóa super là sử dụng để lấy giá trị thuộc tính ở lớp cha
//    public void speak() {
//        System.out.println("Địa chỉ nhà tôi ở: " + super.address);
//    }

    @Override
    public void speak() {
        System.out.println("Con biết rồi, con cũng cảm nhận được mà !!!");
    }


    // KẾT LUẬN:
    /*
        từ khóa super là lấy thuộc tính và phương thức
        phương thức super() là đại diện cho constructor của lớp cha
    */

    /*
        Hãy tạo 1 lớp Employee
        - thuộc tính:
            + name
            + age
            + department
        Hãy tạo ra 2 lớp con là FullTime và PartTime
        Lớp FullTime mặc định là 8 tiếng và nhận với hệ số là 50000 1 giờ - tính lương 1 ngày
        Lớp PartTime mặc định là sẽ có giờ làm là bn và số tiền của 1 giờ là 30k / giờ - tính lương 1 ngày
        --> Thực hiện khởi tạo 2 đối tượng và hiển thị ra số tiền lương trong 1 ngày
    */

}
