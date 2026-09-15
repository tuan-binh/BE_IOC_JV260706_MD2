package btth;

public class Car extends Vehicle {
    private int seatingCapacity;
    private int speed = 180;

    public Car(String id, String brand, double basePrice, int seatingCapacity) {
        super(id, brand, basePrice);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double calculateCost() {
        return this.seatingCapacity < 5 ? super.basePrice * 1.15 : super.basePrice * 1.25;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Seating Capacity: %d\n", seatingCapacity);
        System.out.println("Tốc độ riêng của car là " + this.speed);
        System.out.println("Tốc độ chung là phương tiện là " + super.speed);
    }
}
