package inheritance.example_2;

public class SportEvent {
    String name;
    String date;
    String place;

    void start() {
        System.out.println("Начало событий: " + name);
        System.out.println("Дата проведения: " + date);
        System.out.println("Место: " + place);
    }
}
