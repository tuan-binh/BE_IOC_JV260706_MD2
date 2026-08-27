package demo_encapsulation;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Shiba");
        dog.setBreed("Japan");
        dog.setLegs(4);

        // Hiển thị
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(dog.getLegs());
    }
}
