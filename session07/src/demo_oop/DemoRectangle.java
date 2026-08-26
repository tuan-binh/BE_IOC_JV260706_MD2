package demo_oop;

import java.util.Scanner;

public class DemoRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Nhập chiều dài: ");
        rectangle.height = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chiều rộng: ");
        rectangle.width = Double.parseDouble(sc.nextLine());

        double area = rectangle.getArea();
        System.out.println("Diện tích là " + area);
        double perimeter = rectangle.getPerimeter();
        System.out.println("Chu vi là " + perimeter);
    }
}
