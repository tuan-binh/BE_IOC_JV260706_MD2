package demo_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        // Bài toán; Lưu điểm sinh viên: Key - String - tên sinh viên, Value - Double - điểm sinh viên
        Map<String, Double> students = new HashMap<>();

        // Thêm: put
        students.put("Nguyễn Hải Đăng", 8.5);
        students.put("Nguyễn Huy Khánh", 7.0);
        students.put("Lê Văn Dũng", 9.5);
        students.put("Nguyễn Hải Đăng", 10.0); // Thêm trùng key và cập nhật giá trị value
//        students.put(null, 5.5);

        // kiểm tra key có tồn tại hay không
        System.out.println("Có tồn tại dũng ở đây hay không = " + students.containsKey("Lê Văn Dũng 1"));
        // Tương tự như containsValue() cũng tương tự như thế

        Set<String> keys = students.keySet();
        System.out.println("KEY = " + keys);

        Collection<Double> values = students.values();
        System.out.println("VALUE = " + values);

        // Hiển thị:
        System.out.println(students);

        // Khả năng của phương thức entrySet(); -> Map.Entry

        Set<Map.Entry<String, Double>> entry = students.entrySet();
        // Cung cấp các phương thức làm việc trực tiếp với key và value
        for (Map.Entry<String, Double> e : entry) {
            if (e.getKey().equals("Lê Văn Dũng")) {
                e.setValue(e.getValue() + 2);
            }
        }

        System.out.println(students);



    }
}
