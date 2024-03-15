package tasks.tasks110324.hw1;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product product1 = new Product("Товар1", "Категория1", 10, 100.0);
        Product product2 = new Product("Товар2", "Категория2", 20, 50.0);
        User user = new User("Максим", "max100500@gmail.com");
        User user2 = new User("Кирилл", "krll@gmail.com");
        store.addProduct(product1);
        store.addProduct(product2);

    }
}
