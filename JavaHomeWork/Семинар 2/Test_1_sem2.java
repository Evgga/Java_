//Дана последовательность N целых чисел. Найти сумму простых чисел.

package org.example.JavaHomeWork;

import java.util.Scanner;

public class Test_1_sem2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число равное количеству элементов последовательности: ");
        int size = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        int sum = 0;
        for (int item : array) {
            if (simpleNumber(item)) sum += item;
            System.out.print(item + " ");
        }
        System.out.println("sum = " + sum);
    }
    public static boolean simpleNumber (int num) {
        if (num < 2) return false;
        for (int i = 2; i < Math.pow(num, 0.5) + 1 ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}













