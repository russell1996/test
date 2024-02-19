package tasks.tasks160224.hw1;

import tasks.tasks160224.hw1.Flyable;
import tasks.tasks160224.hw1.Waterfowl;

public class Duck implements Flyable, Waterfowl {
    @Override
    public void fly() {
        System.out.println("Лечу над камышами!");
    }

    @Override
    public void land() {

    }

    @Override
    public void swim() {
        System.out.println("Плаваю в пруду!");
    }
}
