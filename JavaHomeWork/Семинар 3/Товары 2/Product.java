package org.example.JavaHomeWork.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private String nameProduct;
    private String country;
    private Integer weightGrams;
    private Integer price;
    private Integer grade;

    public Product(String nameProduct, String country, Integer weightGrams, Integer price, Integer grade) {
        this.nameProduct = nameProduct;
        this.country = country;
        this.weightGrams = weightGrams;
        this.price = price;
        this.grade = grade;
    }
}

