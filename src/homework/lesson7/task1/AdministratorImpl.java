package homework.lesson7.task1;

public class AdministratorImpl implements Administrator {
    @Override
    public void findBook(String name) {
        System.out.println("Администратор ... ищет книгу с названием " + name);
    }

    @Override
    public void giveBook(Reader reader, Book book) {
        System.out.println(reader.getName());
        System.out.printf("Администратор ... нашел книгу '%s' и отдает читателю ...\n", book.getTitle());
    }
}
