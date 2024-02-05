package tasks.task19_01_24;

public class Main {
    public static void main(String[] args) {
        String phrase1 = "Я люблю кодить";
        String phrase2 = "Самый быстрый язык программирования это";
        String phrase3 = "Язык программирования Java";
        System.out.println(penaltyWord(phrase1));
        System.out.println(penaltyWord(phrase2));
        System.out.println(penaltyWord(phrase3));
    }
    static String penaltyWord(String text){
        String [] i = text.split(" ");
                return i[i.length -3];

    }
}