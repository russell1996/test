package tasks.t1;

public class Circle implements Shape{
    private final double a;


    public Circle(double a) {
        this.a = a;
    }


    @Override
    public double getArea() {
        return (a*3.14)*2;
    }
}
