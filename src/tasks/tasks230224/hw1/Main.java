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

        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
        };
    }

    public static void validEvent(Event event) {

        if (event == null || event.title == null || event.releaseYear == 0 || event.age == 0) {
            throw new RuntimeException("Данные не найдены");
        }
    }


}
