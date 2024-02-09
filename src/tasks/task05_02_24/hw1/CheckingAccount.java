package tasks.task05_02_24.hw1;

public class CheckingAccount extends Account {
    private int balance;



    @Override
    public void pay(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("С расчетного счета списано: " + amount + " тенге. Текущий баланс расчетного счета: " + balance + " тенге.");
        } else {
            System.out.println("Недостаточно средств для списания. Текущий баланс расчетного счета: " + balance + " тенге.");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance >= amount) {
            balance -= amount;
            account.addMoney(amount);
            System.out.println("Переведено " + amount + " тенге на другой счет. Текущий баланс: " + balance + " тенге.");
        } else {
            System.out.println("Недостаточно средств для перевода. Текущий баланс: " + balance + " тенге.");
        }
    }

    @Override
    public void addMoney(int amount) {
        if (balance >= amount) {
            System.out.println("Пополнение на сумму " + amount + " отклонено. После пополнения баланс расчетного счета не может быть отрицательным. Текущий баланс: " + balance + " тенге.");
            System.out.println();
        }else {
            balance += amount;
            System.out.println("Расчетный счет пополен на сумму: " + amount + ". Текущий баланс: " + balance + " тенге.");
            System.out.println();
        }
    }
}
