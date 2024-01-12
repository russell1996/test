package polymorphism.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.println("0. выход,");
        System.out.println("1. Пистолет");
        System.out.println("2. Автомат");

        player.getSlotsCount();

        for (; ; ) {
            int slot = 0;
            if (slot == 0) {
                break;
            } else {
                System.out.println("Введите номер оружия: ");
                scanner.nextInt();
                player.shotWithWeapon(slot);
            }


            // TODO главный цикл игры:
            // запрашивать номер с клавиатуры
            // с помощью scanner.nextInt(),
            // пока не будет введено -1


        }
    }
}
