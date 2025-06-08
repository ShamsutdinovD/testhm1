package kfc;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        int sum = 0;
        int max = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
            System.out.print(array[i] + " ");
            sum = sum + array[i];
        }

        System.out.println("\nСумма всех элементов: " + sum);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

            System.out.println("\nНаибольший элемент массива: " + max);

    }
}