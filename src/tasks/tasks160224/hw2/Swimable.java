package tasks.tasks160224.hw2;

public interface Swimable {
    public default void startSwimming() {
        return;
    }

    public void stopSwimming();
    public void gracefulSwim();
}
