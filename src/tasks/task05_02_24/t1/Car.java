package tasks.task05_02_24.t1;

public class Car extends Transport {

    public Car(String name, int countWheels, String transportType) {
        super(name, countWheels, transportType);
    }

    @Override
    public void gas() {
        System.out.println("Машина заведена");
    }

    @Override
    public void stop() {
        System.out.println("Машина заглушена");

    }
}
