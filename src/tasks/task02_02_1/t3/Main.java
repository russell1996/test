package tasks.task02_02_1.t3;

public class Main {
    public static void main(String[] args) {
        String text = "application hello transaction";
        String[] parts = text.split(" ");
        System.out.println(parts[0]+ " "+ parts[parts.length-1]);
    }
}
