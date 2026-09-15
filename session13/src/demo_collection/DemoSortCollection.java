package demo_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoSortCollection {
    public static void main(String[] args) {
        // So sánh Comparable vs Comparator (interface)
        /*
            1. Comparable - So sánh kiểu tĩnh - triển khai trong lớp muốn so sánh
            2. Comparator - So sánh kiểu động - triển khải thẳng luôn (functional interface)
        */

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dũng", 18));
        students.add(new Student(2, "Kiên", 17));
        students.add(new Student(3, "Đăng", 20));
        students.add(new Student(4, "Khánh", 22));
        students.add(new Student(5, "Sơn", 10));

        System.out.println("before = " + students);

//        students.sort(Comparator.comparingInt(Student::getAge));
        students.sort(Comparator.comparing(Student::getName).reversed());

        System.out.println("after = " + students);

    }
}
