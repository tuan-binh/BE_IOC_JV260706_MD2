package bai_thuc_hanh;

import demo_constructors.Person;

public class Main {
    /*
        BÀI TOÁN:
        Yêu cầu:
        Sử dụng tính chất đóng gói Encapsulation
        Khởi tạo 1 đối tượng sinh viên:
        id - String
        name - String
        age - int
        Nhập thông tin sinh viên yêu cầu validate
        id:
        không được để trống
        phải là SVxxx (VD: SV001)
        name
        Không được để trống
        Ít nhất 2 ký tự
        age
        Không được để trống
        Phải lớn hơn 0
        Sau khi nhập xong thì hiển thị thông tin ra màn hình
    */
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("SV001");
        student.setName("Nguyễn Văn A");
        student.setAge(23);
        System.out.println(student);
    }
}
