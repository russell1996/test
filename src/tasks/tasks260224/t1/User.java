package tasks.tasks260224.t1;

public class User {
    protected String login;
    protected String password;
    protected String email;
    protected int age;

    public User(String login,
                String password,
                String email,
                int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;

    }

    public static class UserNotFoundException extends Exception {
        public UserNotFoundException(String message) {
            super(message);
        }
    }

    public static class AccessDeniedException extends Exception {
        public AccessDeniedException(String message) {
            super(message);
        }
    }
}
