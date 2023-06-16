/**Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
        Получить наименования товаров заданного сорта с наименьшей ценой.*/

package org.example.JavaHomeWork.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Конфета", "Франция", 150, 100, 1);
        Product product2 = new Product("Пряник высший", "Россия", 200, 50, 2);
        Product product3 = new Product("Хлеб", "Россия", 100, 80, 1);
        Product product4 = new Product("Гречка", "Россия", 1000, 100, 1);
        Product product5 = new Product("Природная вода", "Россия", 1000, 50, 3);
        Product product6 = new Product("Пирог высший", "Китай", 1500, 300, 2);
        Product product7 = new Product("Овсянная каша", "Россия", 200, 120, 1);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);

        List<String> result = productGetGradeMinPrice(products);
        for (String s : result) {
            System.out.print(s + "; ");
        }
    }
    private static List<String> productGetGradeMinPrice(List<Product> products) {
        int grade = getGrade();
        List<String> result = new ArrayList<>();
        int min = findMaxPrice(products);
        for (Product product : products) {
            if (product.getGrade() == grade && min > product.getPrice()) min = product.getPrice();
        }
        for (Product product : products) {
            if (product.getPrice() == min) result.add(product.getNameProduct());
        }
        return result;
    }
    private static int findMaxPrice(List<Product> products) {
        int max = 0;
        for (Product product : products) {
            if (max < product.getPrice()) max = product.getPrice();
        }
        return max;
    }
    private static int getGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара(1, 2, 3):");
        while (true) {
            int grade = scanner.nextInt();
            switch (grade) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default: {
                    System.out.println("Введен некорректный сорт");
                    break;
                }
            }
        }
    }
}