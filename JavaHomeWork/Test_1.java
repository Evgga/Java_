package org.example.JavaHomeWork;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = scanner.nextLine();
        System.out.println("revers(Str) = " + reversStr(str));
        scanner.close();
    }

    private static String reversStr(String str) {
        String[] array = str.trim().split(" ");
        String result = "";
        int ind = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            String tmp = array[i];
            array[i] = array[ind];
            array[ind] = tmp;
            ind--;
        }
        for (String el : array) {
            result += el + " ";
        }
        return result.trim();
    }
}

