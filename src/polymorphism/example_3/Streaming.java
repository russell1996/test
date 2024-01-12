package polymorphism.example_3;

public class Streaming {
    private String streamingName;
    private int amountOfSeries;
    private int amountOfMovies;
    private Media[] media;

    public Streaming(String streamingName, int amountOfSeries, Media[] media) {
        this.streamingName = streamingName;
        this.amountOfSeries = amountOfSeries;
        this.media = media;
    }

    public void add (Media media) {
        for (int i = 0; i < this.media.length; i++) {

        }
    }

    public void play (Media media) {
        System.out.println(media.getTitle());
    }


}
