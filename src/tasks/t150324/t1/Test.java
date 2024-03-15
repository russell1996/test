package tasks.t150324.t1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<String, Double> currencies = new HashMap<>();
        currencies.put("USD", 447.61);
        currencies.put("EUR", 487.96);
        currencies.put("GBR", 570.92);
        System.out.println("Введите сумму в тенге: ");
        Scanner scanner = new Scanner(System.in);
        double inputSum = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите валюту: ");
        String currency = scanner.next();
        System.out.println(inputSum + " тг в " + currency + " составляет: " + inputSum / currencies.get(currency) + " " + currency);
        // 570.92

    }
}
