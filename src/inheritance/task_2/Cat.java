package inheritance.task_2;

public class Cat extends Animal {
    public Cat(String name) {
        super("Мяу", 4, name);
    }

    @Override
    void display() {
        System.out.println("Кот: ");
        super.display();
        System.out.println("Способность: ловить мышей");
    }
}
