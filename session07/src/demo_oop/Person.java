package demo_oop;

public class Person {

    // thuộc tính - mô tả đặc điểm nhận dạng
    String name;
    int age;
    String address;
    // ...

    // Nếu không khai báo constructor nào thì mặc định sẽ có constructor không tham số
    // Nếu khai báo thì chỉ sử dụng được những cái khai báo thôi
    // Constructor
    // <Access Modifier> <ClassName> (parameter) {}
//    public Person() {
//        // Constructor không tham số
//    }
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }

    // Phím tắt tạo constructor là alt + insert
    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // phương thức - hành vi (là những hành động của đối tượng)
    // <kiểu dữ liệu trả về> <tên phương thức> ( parameter... ) { phần thân phương thức }
    void speak() {
        System.out.println(name + " đang nói ...");
    }

    void eat() {
        System.out.println(name + " đang ăn ...");
    }



}
