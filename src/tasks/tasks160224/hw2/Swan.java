package tasks.tasks160224.hw2;

public class Swan extends Animal implements Swimable, Flyable{

    @Override
    public void makeSound() {
        System.out.println("Лебедь издает Га га га.");
    }

    @Override
    public void startSwimming() {
        System.out.println("Лебедь начал плавать в озере");
    }

    @Override
    public void stopSwimming() {
        System.out.println("Лебедь перестал плавать в озере");
    }

    @Override
    public void gracefulSwim() {
        System.out.println("Лебедь изящно поплыл");
    }

    @Override
    public void soarHigh() {
        System.out.println("Лебедь парит высоко в небе");

    }
}
