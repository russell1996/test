package tasks.tasks190224.hw2;

import java.util.Objects;

public class Song {
    private final String title;
    private final String artist;
    private final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }


    // переопределите метод equals(Object)


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(songwriter, song.songwriter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, songwriter);
    }
}
