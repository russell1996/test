package tasks.tasks160224.hw2;

public class Eagle extends BirdOfPrey implements Flyable, Hunter {
    @Override
    public void makeSound() {
        System.out.println("Орел издает резкий крик.");
    }
    @Override
    public void soarHigh() {
        System.out.println("Орел парит высоко в небе.");
    }

    @Override
    public void huntSmallAnimals() {
        System.out.println("Орел охотится на мелких животных.");
    }
}
