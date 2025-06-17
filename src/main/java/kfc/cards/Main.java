package kfc.cards;

public class Main {

    public static void main(String[] args) {
        Debitcard1 debitcard1 = new Debitcard1("sber", 10000, 1000);
        Debitcard2 debitcard2 = new Debitcard2("tink", 20000, 2000);

        debitcard1.printInfo();
        debitcard2.printInfo();
    }
}
