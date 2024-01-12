package inheritance.example_2;

public class FootballMatch extends SportEvent {
    int amountOfPlayers;

    @Override
    void start() {
        System.out.println("Начало событий: " + name);
        System.out.println("Дата проведения: " + date);
        System.out.println("Место: " + place);
        System.out.println("Количество игроков: " + amountOfPlayers);
    }


}

