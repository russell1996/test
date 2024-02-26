package tasks.tasks230224.hw1;

public class Main {
    public static void main(String[] args) {

        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");

    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("", 2010, 16)

        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16)
        };
    }

    public static void validEvent(Event events) {
        if (events == null || events.title == null || events.releaseYear == 0 || events.age == 0) {
            throw new RuntimeException("Данные не найдены");
        }
    }
}
