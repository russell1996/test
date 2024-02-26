package tasks.t1;

public class App {
    // BEGIN (write your solution here)
public static String getHiddenCard(String num){
    String hidden = num.substring(0, 12);
    String stars = "*".repeat(hidden.length());
    return num.replaceFirst(hidden, stars);
}

    public static void main(String[] args) {
        System.out.println(App.getHiddenCard("1234567891011121"));
    }
}



