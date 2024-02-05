package tasks.task29_01_24.t2;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        User[] users = {
                new User("Igor", 19),
                new User("Alexey", 23),
                new User("Misha", 18),
                new User("Dima", 25),
        };
        builder.append("users=[");
        //   users=[{name=Igor, age=19}, {name=Alexey, age=23}, ...]
        for (int i = 0; i < users.length; i++) {
            String json = String.format("{name=%s, age=%d}, ", users[i].getName(), users[i].getAge());
            builder.append(json);
        }
        builder.delete(builder.length()-2,builder.length());
        builder.append("]");
        System.out.println(builder);

    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

