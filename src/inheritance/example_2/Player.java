package inheritance.example_2;

public class Player {
    String name;
    Integer age;
    String nationality;

    public Player(String name, Integer age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Player() {

    }

    void display(){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Национальность: " + nationality);

    }
}
