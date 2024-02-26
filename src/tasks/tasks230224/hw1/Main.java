package tasks.tasks230224.hw1;
import java.util.Calendar;

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
                new Movie("Начало", 2024, 16),
                new Movie("Ч", 2024, 1)

        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2023, 16)
        };
    }

    public static void validEvent(Event events) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.getWeekYear();
        if (events.title == null || events.title.isBlank()) {
            throw new RuntimeException("Не указано название");
        }
        if (events.releaseYear == 0 || events.releaseYear < currentYear) {
            throw new RuntimeException("Не указан год. Год должен быть не позднее " + currentYear);
        }
        if (events.age == 0) {
            throw new RuntimeException("Не указан возрастное ограничение");
        }

    }
}


// events.title == null || events.releaseYear == 0 || events.age == 0