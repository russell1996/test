package inheritance.task_2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка");
        Rat rat = new Rat("Байзак", "Дебил");
        cat.display();
        System.out.println();
        rat.display();
    }
}
