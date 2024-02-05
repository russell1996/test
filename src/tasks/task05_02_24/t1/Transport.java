package tasks.task05_02_24.t1;

public abstract class Transport {
    private String name;
    private int countWheels;
    private String transportType;

    public Transport(String name, int countWheels, String transportType) {
        this.name = name;
        this.countWheels = countWheels;
        this.transportType = transportType;
    }

    public abstract void gas();
    public abstract void stop();

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

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
}

