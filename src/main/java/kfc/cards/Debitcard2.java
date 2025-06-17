package kfc.cards;

public class Debitcard2 extends card{

    private  double replenishment;


    public Debitcard2(String name, double balance, double replenishment) {
        super(name, balance);
        this.replenishment = replenishment;
    }

    @Override
    public double getBonuspoints() {
        return 0;
    }

    @Override
    public double getAccumulation() {
        return replenishment * 0.005;
    }
}
