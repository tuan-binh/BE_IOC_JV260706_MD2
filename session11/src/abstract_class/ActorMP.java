package abstract_class;

// Lớp tướng có mana
public class ActorMP extends Actor {
    private int MP;

    public ActorMP() {
    }

    public ActorMP(String name, int hp, int MP) {
        super(name, hp);
        this.MP = MP;
    }

    // Lớp con bắt buộc phải triển khai phương thức trừu tượng (abstract)
    @Override
    public void attack() {
        System.out.println("Đang cast chiêu thức");
        MP--;
    }

    @Override
    public String toString() {
        return super.getName() + " | " + super.getHp() + " | " + MP;
    }
}
