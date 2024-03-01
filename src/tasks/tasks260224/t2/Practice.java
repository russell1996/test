package tasks.tasks260224.t2;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(92.3);
        temperatures.add(12.4);
        temperatures.add(74.1);
        temperatures.add(45.0);
        temperatures.add(92.4);
        temperatures.add(1000.5);
        double max = 0;
        for (Double temperature : temperatures) {
            if (temperature > max) {
                max = temperature;
            }
        }
        System.out.println("Самая высокая температура " + max + " С.");
    }
}