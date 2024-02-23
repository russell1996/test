package tasks.tasks230224.t1;

import java.math.BigInteger;

public class IntegerParser {
    public static int parseInt(String inputValue) {
        BigInteger integer = new BigInteger(inputValue);
        if (inputValue.isBlank()) {
            throw new StringIsEmptyException("Строка пустая!");
        } else if (integer.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            throw new StringIsTooBigNumberException("Салам алейкум, число слишком большое");
        } else if (integer.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            throw new StringIsTooBigNumberException("Салам алейкум, число слишком маленькое");
        }
        return parseInt(inputValue);
    }
}
