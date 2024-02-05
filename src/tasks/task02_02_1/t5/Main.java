package tasks.task02_02_1.t5;

public class Main {
    public static void main(String[] args) {
        String text = "application hello template hello translate";
        String word = "hello";
        String s2 = text.replace (word, "*");
        System.out.println(s2);
    }
}
