package kfc.cards;

public class CashBackCard extends Card {

    private  double replenishment;


    public CashBackCard(String name, double replenishment) {
        super(name);
        this.replenishment = replenishment;
    }


    @Override
    public void pay() {
        minusBalance(5000);
        if (getBalance() < 0) {
            System.out.println("Недостаточно средств");
        } else {
            System.out.println("Баланс: " + getBalance());
        }
    }

    @Override
    public void increaseBalance() {
        plusBalance(2000);
        System.out.println("Количество накоплений: " + (getBalance() + replenishment * 0.0005));
    }
}
