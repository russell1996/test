package tasks.task05_02_24.hw1;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CreditAccount creditAccount = new CreditAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        savingAccount.pay(500);
        savingAccount.addMoney(500);
        savingAccount.addMoney(-50000);
        savingAccount.addMoney(550);
        creditAccount.addMoney(-500);
        savingAccount.transfer(creditAccount, 50);
        savingAccount.transfer(creditAccount, 500);
        creditAccount.transfer(savingAccount,50);
        creditAccount.pay(5000);
    }
}
