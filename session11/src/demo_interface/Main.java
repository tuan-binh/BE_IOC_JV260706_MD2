package demo_interface;

public class Main {
    public static void main(String[] args) {
        BluePrint nhaTrenHaGiang = new Homestay();

        nhaTrenHaGiang.xayMongNha();

        nhaTrenHaGiang.doNen();

        nhaTrenHaGiang.xayTuongNha();

        nhaTrenHaGiang.doMaiNha();

        /*
            triển khai 1 interface Shape có 2 phương thức trừu tượng là tính chu vi và tính diện tích

            có 2 lớp triển khai
            - Circle: có thuộc tính là radius
            - Rectangle: có thuộc tính width và height
                - Có 1 lớp kế thừa là Square (hình vuông)

            Main
            Tạo lập 1 danh sách các hình học và duyệt qua in tên hình
            và hiển thị chu vi và diện tích ra màn hình
        */
    }
}
