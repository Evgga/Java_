//Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует отрицательное число.
package org.example.JavaHomeWork;

 import java.util.Scanner;


public class Test_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел, заканчивающаяся 0: ");
        int x = scanner.nextInt();
        System.out.println("sumNum(n,scanner) = " + sumNum(x, scanner));
    }

    private static int sumNum(int x, Scanner scanner) {
        int sum = 0;
        do {
            int x1 = scanner.nextInt();
            if (x1 < 0 && x > 0) {
                sum += x;
            }
            x = x1;
        } while (x != 0);
        scanner.close();
        return sum;
    }
}




