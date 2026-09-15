package demo_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        // Yêu cầu là thêm
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("Nhập mã của sinh viên: ");
            student.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập tên của sinh viên: ");
            student.setName(sc.nextLine());
            System.out.println("Nhập tuổi của sinh viên: ");
            student.setAge(Integer.parseInt(sc.nextLine()));

            students.add(student);
        }

        // Yêu cầu là hiển thị
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }
}
