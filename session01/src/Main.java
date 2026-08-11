

// PascalCase - in hoa tất cả chữ cái đầu tiên MyChild - Quy tắc đặt tên với class
public class Main {
    public static void main(String[] args) {
        // cách viết tắt: sout --> System.out.println()
        /**
         * Khi code java phải có chấm phẩy kết câu lệnh
         * */
        System.out.println("Hello, World!");

        // String - kiểu đối tượng - phải viết hoa chữ cái đầu tiên

        // syntax: <datatype> <variableName> = <value>;

        // khởi tạo và khai báo
        String name = "Lê Hải Dũng";
        // Cách khai báo và khởi tạo nhiều biến cùng 1 lúc
        int age = 18, birthYear = 2005;

        // Khai báo hằng số sử dụng từ khóa final
        // Hằng số: phải tuân theo quy tắc đặt tên là UPPERCASE -> tất cà phải viết hoa
        final float SCORE = 10;

        // không thể gán giá trị mới cho hằng số
        // SCORE = 9;

        System.out.println("name = " + name + " | Age = " + age);
    }
}