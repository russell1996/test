package tasks.task02_02_24.t1;

public class Main {
    public static void main(String[] args) {
        String text = "application  hello template";
        String word = "hello";
        int index = text.indexOf(word);
        boolean cont = text.contains(word);
        boolean str = text.startsWith(word);
        System.out.println(index);
        System.out.println(cont);
        System.out.println(str);
        if (cont) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Слово не найдено");
        }
        if (index != -1) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Слово не найдено");
        }
        if (str) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Слово не найдено");
        }
    }
}
