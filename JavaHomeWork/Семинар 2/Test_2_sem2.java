//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
package org.example.JavaHomeWork;

import java.util.Random;
import java.util.Scanner;

public class Test_2_sem2 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        int flag;
        flag = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 89 + 10);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > mas[i + 1]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Последовательность не является строго возрастающей");
        } else {
            System.out.println("Последовательность является строго возрастающей");
        }
    }
}


