package other_package;

import demo_constructors.Person;

import java.util.Scanner;

public class Main extends Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cú pháp khởi tạo đối tượng:
        // Datatype variableName = new DataType();
        Person dang = new Person();
        dang.inputData(sc);
        dang.displayData();

        Person son = new Person();
        son.inputData(sc);
        son.displayData();

        Person.displayClass();

        // Sau khi thay đổi giá trị static
        dang.displayData();
        son.displayData();

        Person.displayClass();


    }

}