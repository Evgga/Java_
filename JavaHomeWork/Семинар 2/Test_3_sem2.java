//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

package org.example.JavaHomeWork;

import java.util.Random;
import java.util.Scanner;

public class Test_3_sem2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число равное количеству элементов в последовательности: ");
        int size = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[size];
        int sum = sumIndex(array);
        getArray(array, sum);
    }

    private static int sumIndex(int[] array) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 + 100) - 100;
            if ((-100 < array[i] && array[i] < -9) || (9 < array[i] && array[i] < 100)) sum += i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return sum;
    }

    private static void getArray(int[] array, int sum) {
        for (int j = 0; j < array.length; j++) {
            if(array[j] < 0) array[j] = sum;
            System.out.print(array[j] + " ");
        }
    }
}
