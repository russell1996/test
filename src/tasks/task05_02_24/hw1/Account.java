package tasks.task05_02_24.hw1;

import tasks.task05_02_24.t1.TransportType;

public abstract class Account {


    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

}
