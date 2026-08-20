package string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Data science";
        String str3 = "Python";

        String str4 = new String("Python");
        String str5 = new String("Data science");
        String str6 = new String("Python");

        // So sánh
        System.out.println("So sánh string nhưng ở trong bộ nhớ String pool ," + (str1 == str3));

        System.out.println("So sánh string nhưng thông qua khởi tạo new "+(str4.equals(str6)));

        // --> Tất cả những kiểu dữ liệu đối tượng sẽ sử dụng equals để so sánh giá trị,
        // --> Còn == thì sẽ sử dụng cho trường hợp kiểu dữ liệu nguyên thủy

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        // ============================ METHOD STRING ================================

        String char1 = "Binh";
        String char2 = "Bao";

        System.out.println(char1.compareTo(char2));

        String name = "Nguyễn Hải Đăng";

        String search = "Khánh";

        System.out.println(name.contains(search));

        System.out.println(name.indexOf("H"));

        String[] arrayName = name.split(" ");

        System.out.println(Arrays.toString(arrayName));

        System.out.println(name.substring(11));

        StringBuilder str = new StringBuilder("Nguyễn Huy Khánh");
        System.out.println(str);
        // cũng cung cấp các phương thức làm việc cơ bản
        // append
        // insert
        // delete
        // replace


    }
}
