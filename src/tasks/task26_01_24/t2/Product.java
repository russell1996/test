package tasks.task26_01_24.t2;

public class Product {
    private String name;
    private  double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }

}
