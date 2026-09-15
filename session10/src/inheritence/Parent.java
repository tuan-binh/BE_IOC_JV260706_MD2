package inheritence;

public class Parent extends GrandParent {
    protected String name;
    protected String address;

    public Parent() {
    }

    public Parent(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void speak() {
        System.out.println("Học đi con, ko sau này hối hận không kịp");
    }
}
