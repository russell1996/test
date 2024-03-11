package tasks.tasks110324.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> numbers = List.of("0. Выход", "1. Добавить задачу", "2. Вывести список задач", "3. Удалить задачу");
        List<String> lists = new ArrayList<>(List.of());
        System.out.println("Выберите действие: ");
        for (; ;) {
            System.out.println(numbers.get(1));
            System.out.println(numbers.get(2));
            System.out.println(numbers.get(3));
            System.out.println(numbers.get(0));
            int t = Integer.parseInt(s.nextLine());
            if (t == 1) {
                System.out.println("Введите задачу для планирования: ");
                String t1 = s.nextLine();
                lists.add(t1);
            }
            if (t == 2) {
                for (int i = 0; i < lists.size(); i++) {
                    System.out.println(i+1 + " " + lists.get(i));
                }
            }
            if (t == 3) {
                for (int i = 0; i < lists.size(); i++) {
                    System.out.println(i+1 + " " + lists.get(i));
                }
                System.out.println("Введите номер задачи для удаления: ");
                String t3 = lists.remove(Integer.parseInt(s.nextLine())-1);

            }
            if (t == 0) {
                break;
            }
        }
    }
}

