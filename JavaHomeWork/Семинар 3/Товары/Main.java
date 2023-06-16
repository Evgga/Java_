/**Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».*/

package org.example.JavaHomeWork;


import lombok.SneakyThrows;

import java.util.List;
import java.util.ArrayList;


public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        Product product1 = new Product("Конфета", 100, 1);
        Product product2 = new Product("Пряник высший", 50, 2);
        Product product3 = new Product("Хлеб", 80, 1);
        Product product4 = new Product("Гречка", 100, 2);
        Product product5 = new Product("Природная вода", 50, 3);
        Product product6 = new Product("Пирог высший", 300, 1);
        Product product7 = new Product("Овсянная каша", 120, 1);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);

        System.out.println("maxPriceProduct(products) = " + maxPriceProduct(products));
    }
    private static int maxPriceProduct(List<Product> products) {
        int max = 0;
        for (Product product : products) {
            if ((product.getGrade() == 1 || product.getGrade() == 2)
                    && product.getNameProduct().toLowerCase().contains("высший")) {
                if (max < product.getPrice()) max = product.getPrice();
            }
        }
        return max;
    }
}
