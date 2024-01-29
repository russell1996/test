package tasks.task26_01_1.t2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("MacBook", 599990);
        products[1] = new Product("AirPods", 60500.3);
        products[2] = new Product("Iphone Pro Max", 450000.3);
        int maxName = 0;

        for (Product product :products){
            int p = product.getName().length();
            if (p>maxName){
                maxName = p;
            }
        }
        System.out.printf("%-"+ maxName + "s %s\n","Название", "Стоимость");
        for (Product product : products) {
            System.out.printf("%-"+ maxName + "s %d\n", product.getName(), (int)product.getPrice());
        }
    }
}
