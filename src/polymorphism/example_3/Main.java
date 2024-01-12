package polymorphism.example_3;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Игра престолов", 2014, 4,9);
        Streaming streaming = new Streaming("HBO", 8, new Movie[]{movie});
        streaming.add(movie);
    }

}
