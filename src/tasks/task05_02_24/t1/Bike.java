package tasks.task05_02_24.t1;

public class Bike extends Transport{


    public Bike(String name, int countWheels) {
        super(name, countWheels, TransportType.BIKE);
    }

    @Override
    public void gas() {
        System.out.println("Ноги крутят педали");

    }

    @Override
    public void stop() {
        System.out.println("Ноги не крутят педали");

    }
}
