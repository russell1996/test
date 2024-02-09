package tasks.task05_02_24.hw1;

public class CheckingAccount extends Account {
    private int balance;

    public CheckingAccount() {
        super(AccountType.CheckingAccount);
    }

    @Override
    public void pay(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("С расчетного счета списано: " + amount + " тенге.");
        } else {
            System.out.println("Недостаточно средств для списания.");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance >= amount) {
            balance -= amount;
            account.addMoney(amount);
            System.out.println("Переведено " + amount + " тенге на другой счет.");
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    @Override
    public void addMoney(int amount) {
        if (balance >= amount) {
            System.out.println("Пополнение на сумму " + amount + " отклонено. После пополнения баланс расчетного счета не может быть отрицательным.");
            System.out.println();
        }else {
            balance += amount;
            System.out.println("Расчетный счет пополен на сумму: " + amount);
            System.out.println("Общая сумма на расчетном счете: " + balance);
            System.out.println();
        }
    }
}
