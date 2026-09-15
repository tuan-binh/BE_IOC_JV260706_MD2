package demo_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoLoop {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dũng", 18));
        students.add(new Student(2, "Kiên", 17));
        students.add(new Student(3, "Đăng", 20));
        students.add(new Student(4, "Khánh", 22));
        students.add(new Student(5, "Sơn", 10));

//        for (Student student : students) {
//            students.remove(1); // Không cho xóa trong quá trình duyệt
//        }

        // Duyệt và có thể thêm sửa xóa trong quá trình duyệt
//        // Nhược điểm chỉ sử dụng được trong kiểu dữ liệu List
//        ListIterator<Student> listIterator = students.listIterator();
//
//        while (listIterator.hasNext()) {
//            Student student = listIterator.next();
//
//        }

        // Iterator chỉ được xóa trong quá trình duyệt
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if(student.getName().equals("Sơn")) {
                studentIterator.remove();
            }
        }

        System.out.println(students);

    }
}
