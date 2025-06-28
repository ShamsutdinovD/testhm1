package kfc.homework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Ноутбук", 70000, 4.0));
        products.add(new Product("Телефон", 50000, 4.5));
        products.add(new Product("Планшет", 30000, 2.6));
        products.add(new Product("Клавиатура", 20000, 3.7));

        printAllProducts(products);

        Product mostExpensive = products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElse(null);
        System.out.println("Товар с наибольшей ценой: " + mostExpensive);
        System.out.println("---------------");

        Product cheapest = products.stream()
                .min(Comparator.comparing(Product::getPrice))
                .orElse(null);
        System.out.println("Товар с наименьшей ценой: " + cheapest);
        System.out.println("---------------");

        printAllProducts(deleteProducts(products));
    }


    public static List<Product> deleteProducts(List<Product> products) {
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getRating() < 3 ) {
                products.remove(products.get(i));
            }
        }
        return products;
    }

    public static void printAllProducts(List<Product> products) {
        products.sort(Comparator.comparing(Product::getName));
        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.println("---------------");
    }


}
