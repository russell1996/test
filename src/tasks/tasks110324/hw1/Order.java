package tasks.tasks110324.hw1;

import java.util.ArrayList;

public class Order {
    private User user;
    private ArrayList<Product> products;
    private double totalCost;

    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>();
        this.totalCost = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
            totalCost += product.getPricePerUnit();
        }
    }

    public double calculateTotalCost() {
        return totalCost;
    }
}
