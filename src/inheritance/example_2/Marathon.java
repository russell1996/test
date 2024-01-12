package inheritance.example_2;

public class Marathon extends SportEvent {
    double distance;
    void start() {
        System.out.println("Начало событий: " + name);
        System.out.println("Дата проведения: " + date);
        System.out.println("Место: " + place);
        System.out.println("Дистанция: " + distance);
    }
}

