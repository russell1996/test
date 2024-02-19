package homework.lesson7.task1;

public class ReaderImpl extends User implements Reader {
    String name;

    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator, Book book) {
        System.out.println("Читатель берет книгу с названием " +book.getTitle()+ " у администратора ...");
    }

    @Override
    public void returnBook() {
        System.out.println("Читатель ... возвращает книгу ...");
    }

    public String getName() {
        return name;
    }
}