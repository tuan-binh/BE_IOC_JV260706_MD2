package demo_encapsulation;

// ÁP DỤNG TÍNH CHẤT ĐÓNG GÓI
public class Animal {
    // Thuộc tính
    private String name;
    private String breed;
    private int legs;

    // Hàm khởi tạo
    public Animal() {

    }

    public Animal(String name, String breed, int legs) {
        this.name = name;
        this.breed = breed;
        this.legs = legs;
    }

    // Phương thức
    // GETTER / SETTER
    // getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    // Mục đích sinh ra tính chất đóng gói là kiểm soát về mặt dữ liệu chúng ta gán
    public void setLegs(int legs) {
        if (legs < 2) {
            this.legs = 2;
        } else {
            this.legs = legs;
        }
    }
}
