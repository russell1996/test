package tasks.task05_02_24.hw1;

import tasks.task05_02_24.t1.TransportType;

public class SavingAccount extends Account {
    int balance = 0;


    @Override
    public void pay(int amount) {
        System.out.println("Платеж со сберегательного счета запрещен. Текущий баланс сберегательного счета: " + balance + " тенге.");
        System.out.println();
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance >= amount) {
            balance -= amount;
            account.addMoney(amount);
        } else {
            System.out.println("Недостаточно средств для перевода. Текущий баланс сберегательного счета: " + balance + " тенге.");
        }
    }

    @Override
    public void addMoney(int amount) {
        if (balance + amount < 0) {
            System.out.println("Пополение на сумму "  +amount + " тенге отклонен. Баланс сберегательного счета не может быть меньше нуля. Текущий баланс сберегательного счета: " + balance + " тенге.");
            System.out.println();
        } else {
            balance += amount;
            System.out.println("Сберегательный счет пополен на сумму: " + amount + " тенге. Текущий баланс сберегательного счета: " + balance + " тенге.");
            System.out.println();
        }

    }
}
