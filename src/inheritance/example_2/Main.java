package inheritance.example_2;

public class Main {
    public static void main(String[] args) {
        FootballMatch fm = new FootballMatch();
        fm.name = "Футбольный матч Аргентина - Казахстан";
        fm.amountOfPlayers = 11;
        fm.date = "12-08-2024";
        fm.place = "Абай Арена";
        fm.start();

        Team tm = new Team();
        tm.teamName = "Великие";
        Player p = new Player();
        p.age = 18;
        p.name = "Расул Амирханов";
        
        tm.display();

    }
}
