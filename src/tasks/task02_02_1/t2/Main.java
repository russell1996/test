package tasks.task02_02_1.t2;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Alex", "DrAke", "Anya", "Leon", "Adam"
        };
        for (String name : names) {
            char n = name.charAt(0);
            if (n == 'A') {
                System.out.println(name);
            }
        }
    }

}

