package btth;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];

        Vehicle car = new Car("CAR01","Vinfast",290000000,4);

        Vehicle bike = new Motorbike("BK001","Vinfast",30000000,110);

        vehicles[0] = car;
        vehicles[1] = bike;

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }

        // Kịch bản 2
        for (Vehicle v : vehicles) {
            if(v instanceof Motorbike){
                ((Motorbike) v).performWheelie();
            }
        }

        // Kịch bản 3
        System.out.println(vehicles[0].calculateInsurance());
        System.out.println(vehicles[0].calculateInsurance(0.05));
        System.out.println(vehicles[0].calculateInsurance(0.1,1000000));


    }
}
