package inheritance.task_2;

public class Rat extends Animal{
    public Rat(String name, String ability) {
        super("Салам я чепушило по имени Байзак ", 10, name);

    }

    @Override
    void display() {
        System.out.println("Главная крыса: ");
        super.display();
        System.out.println("Суперспособность: Нести хуйню");
        System.out.println("Направление: " );
    }
}
