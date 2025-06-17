package kfc.cards;

public abstract class card {

    private String name;
    private double balance;

    public card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public abstract double getBonuspoints();

    public abstract double getAccumulation();

    public void printInfo() {
        System.out.println("Имя карты: " + name);
        System.out.println("Баланс: " + balance);
        System.out.println("Количество бонусных баллов: " + getBonuspoints());
        System.out.println("Количество накоплений: " + getAccumulation());
    }

}
