package polymorphism.example_2;

public class Lion extends Cat{

    public void sleep(){
        System.out.println("Лев спит");
    }
    @Override
    public void run() {
        System.out.println("Лев бежит");
    }
}