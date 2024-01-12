package inheritance.example_2;

public class TennisMatch extends SportEvent {
    String court;
    void start() {
        System.out.println("Начало событий: " + name);
        System.out.println("Дата проведения: " + date);
        System.out.println("Место: " + place);
        System.out.println("Название корта: " + court);
    }
}

