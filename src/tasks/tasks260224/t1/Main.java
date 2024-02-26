package tasks.tasks260224.t1;

import tasks.tasks260224.t1.User.UserNotFoundException;
import tasks.tasks260224.t1.User.AccessDeniedException;

import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("kk", "kk", "pass", 17);
        User user2 = new User("rr", "rr", "pass2", 24);
        return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.login.equals(login) & user.password.equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("Неверный логин или пароль");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age >= 18) {
            return;
        }
        throw new AccessDeniedException("Доступ запрещен, возраст должен быть старше 18 лет");
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        //Вызвать методы валидации пользователя
        System.out.println("Доступ предоставлен");
    }
}
