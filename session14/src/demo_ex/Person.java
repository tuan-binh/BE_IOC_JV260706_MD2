package demo_ex;

import java.util.Date;

public class Person {
    private String id;
    private String name;
    private int age;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String name, int age, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void inputData() {
        // Nhập id
        System.out.println("Nhập vào id của người dùng: ");
        do {
            String inputId = InputUtils.getString(); // Đảm bảo được là không được để trống
            if (inputId.matches("SV\\d{3}")) {
                this.id = inputId;
                break;
            } else {
                System.err.println("Vui lòng nhập đúng định dạng SVxxx");
            }
        } while (true);

        System.out.println("Nhập vào tên của người dùng: ");
        this.name = InputUtils.getString();

        System.out.println("Nhập tuổi người dùng: ");
        do {
            int age = InputUtils.getInt();

            if (age >= 18) {
                this.age = age;
                break;
            } else {
                System.err.println("Vui lòng nhập tuổi lớn hơn hoặc bằng 18");
            }
        } while (true);

        System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        this.dateOfBirth = InputUtils.getDate();

    }

    public void displayData() {
        System.out.printf("ID: %s | Name: %s | Age: %d | Date Of Birth: %s \n", id, name, age, dateOfBirth.toString());
    }

}
