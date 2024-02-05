package tasks.task02_02_24.t4;

public class Main {
    public static void main(String[] args) {
        String text = "application hello template hello";
        String word = "hello";
        int count = 0;
        for (int index = text.indexOf(word); index >= 0; index = text.indexOf(word, index + word.length())) {
            count++;
        }

        System.out.println("Слово '" + word + "' встречается в тексте " + count + " раз(а).");
    }
}