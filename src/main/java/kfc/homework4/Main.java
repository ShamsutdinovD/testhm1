package kfc.homework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Goods> goods = new ArrayList<>();

        goods.add(new Goods("Ноутбук", 70000, 4.0));
        goods.add(new Goods("Телефон", 50000, 4.5));
        goods.add(new Goods("Планшет", 30000, 2.6));
        goods.add(new Goods("Клавиатура", 20000, 3.7));

        printAllGoods(goods);
        printAllGoods(deleteGoods(goods));
    }



    public static List<Goods> deleteGoods(List<Goods> goods) {
        for (int i = 0; i < goods.size(); i++){
            if (goods.get(i).getRating() < 3 ) {
                goods.remove(goods.get(i));
            }
        }
        return goods;
    }

    public static void printAllGoods(List<Goods> goods) {
        goods.sort(Comparator.comparing(Goods::getName));
        for (Goods goods1 : goods) {
            System.out.println(goods1.toString());
        }
    }


}
