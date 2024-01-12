package polymorphism.example_2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(3);

        doctor.add(new Lion());

        System.out.println(Arrays.toString(doctor.getCats()));
        System.out.println(doctor.getAmountOfLions());

//        Cat cat = new Lion();
//        ((Lion) cat).sleep();

//        Cat[] cats = {
//                new Cat(),
//                new Cheetah(),
//                new Tiger()
//        };
//        for (Cat cat : cats) {
//            cat.run();
//        }
    }
}

// Media (title, releaseYear)
// Movie extends Media (rating, duration)
// Series extends Movie (seriesCount)

// Streaming(размер)

// Media[] media
// private int amountOfSeries;
// private int amountOfMovies;

// void add(Media media) {
//      при добавлений фильма к счетчику amountOfMovies,
//      прибавляете единицу.
// }





// play(Media media) {
//      Проверка типа media через instanceOf.
//      Если это сериал, выводите с количеством серий
//      и общую продолжительность.
//      Если фильм, выводите рейтинг и год выпуска.

//      Пример с фильмом:
//      Проигрываем фильм с названием ...
//      Рейтинг: ...
//      Год выпуска: ...
//      Продолжительность: ...

//      Пример с сериалом:
//      Проигрываем сериал с названием ...
//      Рейтинг: ...
//      Год выпуска: ...
//      Количество серий: ...
//      Общая продолжительность: ...
//
// }

