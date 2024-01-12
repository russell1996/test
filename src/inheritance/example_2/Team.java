package inheritance.example_2;

public class Team {
    String teamName;
    Player[] p = new Player[11];

    void display() {
        System.out.println("Название команды: " + teamName);
        System.out.println();
        System.out.println("Игроки: ");
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                p[i].display();
            }
        }
    }
}

