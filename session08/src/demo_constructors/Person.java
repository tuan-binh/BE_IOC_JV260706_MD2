package demo_constructors;

import java.util.Scanner;

public class Person {
    public static String classes = "Rikkei";
    // Thuộc tính - attributes
    // Đây chính là default và ko cần viết gì cả
    public String name;
    public int age;
    public String address;

    // Hàm khởi tạo - Constructors
    // Loại 1: Hàm khởi tạo không tham số
    public Person() {
        // không có giá trị gì mà gán
        // HOẶC: có thể tự gán giá trị default (mặc định)
//        this.name = "Tên mặc định";
    }

    // Loại 2: Hàm khởi tạo có tham số
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Phương thức - Methods

    // phương thức để nhập thông tin yêu cầu là có Scanner để nhập
    // Cú pháp parameter - tham số -> thì phải có kiểu dữ liệu sau đó đến tên biến
    public void inputData(Scanner sc) {
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
    }

    // Phương thức để hiển thị thông tin người dùng
    public void displayData() {
        System.out.printf(
                "[ Name: %s | Age: %d | Address: %s | Class: %s ]\n",
                this.name,
                this.age,
                this.address,
                classes
        );
    }

    public static void displayClass() {
        System.out.println(classes);
    }
}
