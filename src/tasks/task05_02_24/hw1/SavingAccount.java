package tasks.task05_02_24.hw1;

import tasks.task05_02_24.t1.TransportType;

public class SavingAccount extends Account {
    CreditAccount creditAccount = new CreditAccount();
    int balance = 0;

    public SavingAccount() {
        super(AccountType.SavingAccount);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Платеж с данного счета запрещен");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance >= amount) {
            balance -= amount;
            account.addMoney(amount);
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Сберегательный счет пополен на сумму: " + amount);
        System.out.println("Общая сумма на сберегательном счете: " + balance);
        System.out.println();
    }

}
