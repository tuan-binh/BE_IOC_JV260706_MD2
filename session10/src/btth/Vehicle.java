package btth;

public class Vehicle {
    protected String id;
    protected String brand;
    protected double basePrice;
    protected int speed = 60;

    public Vehicle(String id, String brand, double basePrice) {
        this.id = id;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public double calculateCost() {
        return basePrice * 1.1; // VAT 10%
    }

    public void displayInfo() {
        System.out.printf(
                "ID: %s | Brand: %s | Base Price: %.2f | Speed: %d | Cost: %.2f \n",
                id, brand, basePrice, speed, calculateCost());
    }

    public double calculateInsurance() {
        return basePrice * 0.05;
    }

    public double calculateInsurance(double discountRate) {
        return (basePrice * 0.05) * (1 - discountRate);
    }

    public double calculateInsurance(double discountRate, double additionalServiceFee) {
        return (basePrice * 0.05) * (1 - discountRate) + additionalServiceFee;
    }

}
