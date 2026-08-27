package bai_thuc_hanh;

public class Student {
    // thuộc tính
    private String id;
    private String name;
    private int age;

    // hàm khởi tạo
    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    // phương thức


    public String getId() {
        return id;
    }

    public void setId(String id) {
        // Xử lý vấn đề phải tuân theo mẫu SVxxx là số VD: SV001
        // Giải pháp: sử dụng regex
        if (id.matches("SV\\d{3}")) {
            this.id = id;
        } else {
            this.id = "SV000";// hoặc là chúng sẽ quy chụp về hàm nhập thông tin yêu cầu nhập lại
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // ít nhất hai ký tự
        if (name.length() >= 2) {
            this.name = name;
        } else {
            this.name = "Chưa xác định";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Lớn hơn 0;
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    // bình thường là sử dụng hàm tự định nghĩa
    // Mặc định in System.out.println(student) -> trỏ đến toString() để hiển thị
    // Tất cả những đối tượng đều ngầm định kế thừa từ Object


    @Override
    public String toString() {
        return "ID: " + this.id + " | Name: " + this.name + " | Age: " + this.age;
    }
}
