package tasks.tasks160224.hw1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я чайка");
        Seagull seagull = new Seagull();
        seagull.fly();
        seagull.swim();
        seagull.hunt();
        System.out.println();
        System.out.println("Я утка");
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
