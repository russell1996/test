package tasks.tasks110324.hw1;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> inventory;
    private ArrayList<Order> orders;

    public Store() {
        this.inventory = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void removeProduct(Product product) {
        inventory.remove(product);
    }
    public void printProductCategory(Product product){

    }

}