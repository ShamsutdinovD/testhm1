package kfc.cards;

public class Main {

    public static void main(String[] args) {
        BonusCard bonusCard = new BonusCard("Sber", 5000);
        CashBackCard cashBackCard = new CashBackCard("tink", 2000);

        Card[] cards = {bonusCard, cashBackCard};

        for (Card card : cards) {
            card.printInfo();
            card.pay();
            card.increaseBalance();
        }
    }
}
