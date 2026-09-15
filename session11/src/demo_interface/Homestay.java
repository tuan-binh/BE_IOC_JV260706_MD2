package demo_interface;

// triển khai bản vẽ thì sử dụng từ khóa là implement
public class Homestay implements BluePrint,OtherInterface {
    @Override
    public void demoMethod() {
        System.out.println("Đây là phương thức interface thứ 2");
    }

    @Override
    public void xayMongNha() {
        System.out.println("Đang xây móng nhà");
    }

    @Override
    public void doNen() {
        System.out.println("Đang đổ bê tông nền");
    }

    @Override
    public void xayTuongNha() {
        System.out.println("Đang xây tường nhà");
    }

    @Override
    public void doMaiNha() {
        System.out.println("Đang đổ mái");
    }
}
