package inheritance.task_2;

public class Animal {
    String name;
    String voice;
    int pawsCount;

    public Animal(String voice, int pawsCount, String name) {
        this.voice = voice;
        this.pawsCount = pawsCount;
        this.name = name;
    }

    void display() {
        System.out.println("Имя: " + name);
        System.out.println("Звук: " + voice);
        System.out.println("Кол-во лап: " + pawsCount);

    }

    public void getVoice() {
        System.out.println(voice);
    }
}
