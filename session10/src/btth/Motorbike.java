package btth;

public class Motorbike extends Vehicle {
    private int engineCapacity;

    public Motorbike(String id, String brand, double basePrice, int engineCapacity) {
        super(id, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateCost() {
        return engineCapacity > 175 ? super.basePrice * 1.2 : super.basePrice * 1.05;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dung tích xi lanh là " + engineCapacity);
    }

    public void performWheelie() {
        System.out.printf("Mô tô %s thuộc hãng %s đang thực hiện bốc đầu biểu diễn!\n", super.id, super.brand);
    }
}
