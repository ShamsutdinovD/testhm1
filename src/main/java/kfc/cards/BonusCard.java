package kfc.cards;

public class BonusCard extends Card {

    private double purchase;

    public BonusCard(String name, double purchase) {
        super(name);
        this.purchase = purchase;
    }


    @Override
    public void pay() {
        if (getBalance() > purchase) {
            System.out.println("Количество бонусных баллов: " + purchase * 0.01);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    @Override
    public void increaseBalance() {
        plusBalance(2000);
        System.out.println("Баланс: " + getBalance());
    }

}
