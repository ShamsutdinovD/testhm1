package kfc.cards;

public class Debitcard1 extends card {

    private double purchase;

    public Debitcard1(String name, double balance, double purchase) {
        super(name, balance);
        this.purchase = purchase;
    }


    @Override
    public double getBonuspoints() {
        return purchase * 0.01;
    }

    @Override
    public double getAccumulation() {
        return 0;
    }

}
