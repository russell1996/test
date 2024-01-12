package polymorphism.example_2;

public class Doctor {

    private Cat[] cats;

    private int amountOfLions;

    public Doctor(int size) {
        this.cats = new Cat[size];
    }

    public void add(Cat cat) {
        if (cat instanceof Lion) {
            amountOfLions++;
        }

        for (int i = 0; i < cats.length; i++) {
            if (cats[i] == null) {
                cats[i] = cat;
                return;
            }
        }
        System.out.println("Объект не был добавлен");
    }

    public int getAmountOfLions() {
        return amountOfLions;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void heal(Cat cat) {
        if (cat instanceof Lion) {
            System.out.println("Лев здоров");
        } else if (cat instanceof Tiger) {
            System.out.println("Тигр здоров");
        }
    }
}