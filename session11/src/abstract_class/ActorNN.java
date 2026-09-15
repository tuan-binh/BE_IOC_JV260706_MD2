package abstract_class;

public class ActorNN extends Actor {
    private int NN;

    public ActorNN() {
    }

    public ActorNN(String name, int hp, int NN) {
        super(name, hp);
        this.NN = NN;
    }

    @Override
    public void attack() {
        System.out.println("Đang thực hiện chiêu thức sử dụng nội năng");
        NN = NN - 10;
    }

    @Override
    public String toString() {
        return super.getName() + " | " + super.getHp() + " | " + NN;
    }
}
