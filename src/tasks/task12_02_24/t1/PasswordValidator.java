package tasks.task12_02_24.t1;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) throws Exception {
        // пароль должен быть минимум 8 символов
        // пароль должен содержать минимум 1 цифру
        // пароль должен содержать минимум 1 заглавную букву

        System.out.println("Введите пароль");
        String password = new Scanner(System.in).nextLine();
        try {
            checkPassword(password);
        } catch (ArithmeticException ax) {

        }
        if (checkPassword(password)) {
            System.out.println("Пароль подходит");
        } else {
            System.out.println("Пароль не подходит");
        }
    }

    static boolean checkPassword(String password) throws PasswordNotValidException {

        if (password.length() < 8) {
            throw new PasswordNotValidException("Пароль должен быть минимум 8 символов");
        }
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        if (!hasDigit) {
            throw new PasswordNotValidException("Пароль должен содержать хоть одну цифру");
        }
        if (!hasUpperCase) {
            throw new PasswordNotValidException("Пароль должен содержать хоть одну заглавную букву");
        }
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(symbol)) {
                hasUpperCase = true;
            }

            if (hasDigit && hasUpperCase) {
                return true;
            }
        }
        return false;
    }
}
