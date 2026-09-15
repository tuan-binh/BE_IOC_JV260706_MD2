package demo_generic;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        SecretBox<String> magicBox = new SecretBox<>();
        magicBox.setData("Đồng hồ Rolex");
//        magicBox.setData();

        // Bắt buộc những kiểu nguyên thủy phải sử dụng wrapper class
        SecretBox<Integer> scores = new SecretBox<>();
        scores.setData(5);

        demoPrint(9.5);

        demoPrint("Hello World!!");

    }

    public static <T> void demoPrint(T value) {
        // Nếu như sử dụng generic method thì phạm vi của generic chỉ ở trong method này thôi
        System.out.println(value);
    }

}