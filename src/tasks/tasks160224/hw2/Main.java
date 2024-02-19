package tasks.tasks160224.hw2;

public class Main {
    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.makeSound();
        swan.startSwimming();
        swan.gracefulSwim();
        swan.stopSwimming();
        swan.soarHigh();
        System.out.println();
        Eagle eagle = new Eagle();
        eagle.makeSound();
        eagle.soarHigh();
        eagle.huntSmallAnimals();
    }
}
