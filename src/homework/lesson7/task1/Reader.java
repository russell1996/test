package homework.lesson7.task1;

public interface Reader {
    void takeBook(Administrator administrator, Book book);

    void returnBook();

    String getName();
}
