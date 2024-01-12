package tasks.task05_01_1;


public class Book {
    private String title;
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

}



