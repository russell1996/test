package tasks.tasks260224.hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listNumbers = new ArrayList<>();
        System.out.print("Введите размер списка (для завершения ввода нажмите Enter без ввода): ");
        String listSize = scanner.nextLine();
        int numberSum = 0;
        int average = 0;
        for (int i = 0; i < Integer.parseInt(listSize); i++) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            listNumbers.add(number);
            numberSum += number;
        }
        System.out.println("Элементы списка: " + listNumbers);
        System.out.println("Количество элементов: " + listSize);
        int min = listNumbers.get(0);
        int max = listNumbers.get(0);
        for (Integer i : listNumbers) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        average = numberSum/Integer.parseInt(listSize);
        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);
        System.out.println("Среднее значение: " + average);
    }
}
