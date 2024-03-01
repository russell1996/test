package tasks.tasks010324.t1;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    static List<Integer> getEvenNubers(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number%2 ==0){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
