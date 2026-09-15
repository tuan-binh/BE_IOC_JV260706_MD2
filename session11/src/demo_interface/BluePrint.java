package demo_interface;

// Đối với interface bắt buộc phải là trừu tượng hết
// Định nghĩa bản thiết kế
public interface BluePrint {
    // Đào móng
    void xayMongNha();

    void doNen();

    void xayTuongNha();

    void doMaiNha();

    /*
        Đối với Java < JDK 8 thì chỉ có phương thức trừu tượng
        Java > JDK 8  thì sẽ có thêm 2 phương thức default và static
    */

    default void destroy() {

    };
}
