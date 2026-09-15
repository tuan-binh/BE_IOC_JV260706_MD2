package upcasting_downcasting;

public class Main {
    public static void main(String[] args) {
        // Upcasting - 1 con thì chỉ có 1 cha nên luôn luôn an toàn
        Animal animal = new Dog();
        // Downcasting - 1 cha sẽ có nhiều con nên sẽ ko biết xuống con nào nên có thể gây lỗi
        Animal animal2 = new Cat();
        if (animal2 instanceof Cat) {
            Cat newCat = (Cat) animal2;
        }
    }
}
