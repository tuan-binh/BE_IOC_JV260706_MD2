package demo_collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // Chèn vào cuối dùng add không có index
        students.add("Nguyễn Hải Đăng");
        students.add("Lê Việt Dũng");

        // Chèn vào vị trí chỉ định
        students.add(1,"Nguyễn Đình Hưởng");

        // Cập nhật
        students.set(1, "Bùi Hùng Sơn");

        // Xóa
        students.remove(2);

        System.out.println(students);


        // retainAll

        List<String> students2 = new ArrayList<>();
        students.add("Nguyễn Hải Đăng");

        boolean isHas = students.retainAll(students2);
        System.out.println(isHas);

        /*
            BÀI TOÁN:
            Hãy tạo ra 1 class Student {id, name, age}
            Thực hiện vòng lặp nhập thông tin 3 sinh viên và cho vào ArrayList
            cũng như hiển thị danh sách ra
        */

    }
}
