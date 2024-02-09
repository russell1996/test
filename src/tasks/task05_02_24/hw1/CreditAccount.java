package tasks.task05_02_24.hw1;

public class CreditAccount extends Account {
    int balance = 0;

    public CreditAccount() {
        super(AccountType.CreditAccount);
    }

    @Override
    public void pay(int amount) {

    }

    @Override
    public void transfer(Account account, int amount) {

    }

    @Override
    public void addMoney(int amount) {
        if (balance + amount > 0) {
            System.out.println("Пополнение на сумму " + amount + " отклонено. После пополнения баланс кредитного счета не может быть положительным.");
            System.out.println();
        } else {
            balance += amount;
            System.out.println("Кредитный счет пополнен на сумму: " + amount + " тенге. Текущий баланс: " + balance + " тенге.");
            System.out.println();
        }
    }
}