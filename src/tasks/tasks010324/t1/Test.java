package tasks.tasks010324.t1;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,1,22);
        System.out.println(maxNumber(numbers));
    }
    static int maxNumber(List<Integer> numbers){
        return Collections.max(numbers);
    }
}
