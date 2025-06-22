package kfc.cards;

public abstract class Card implements Operations {

    private String name;

    private double balance = 10000;

    public Card(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Карта " + name + " с балансом " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void minusBalance(int amount) {
        balance = balance - amount;
    }

    public void plusBalance(int amount) {
        balance = balance + amount;
    }


}
