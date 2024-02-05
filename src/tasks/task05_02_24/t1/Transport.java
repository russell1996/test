package tasks.task05_02_24.t1;

public abstract class Transport {
    private String name;
    private int countWheels;
    private TransportType transportType;


    public Transport(String name, int countWheels, TransportType transportType) {
        this.name = name;
        this.countWheels = countWheels;
        this.transportType = transportType;
    }


    public abstract void gas();
    public abstract void stop();

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }


}

