package tasks.t1;

public abstract class Parallelogram implements Shape {
    private final double a;
    private final double b;

    public double getArea() {
        return a*b;
    }

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }
}