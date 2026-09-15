package abstract_class;

public abstract class Actor {
    private String name;
    private int hp;

    // constructor
    public Actor() {
    }

    public Actor(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void attack();
}
