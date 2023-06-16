package org.example.JavaHomeWork.Test_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private String nameBook;
    private String surnameAuthor;
    private Integer price;
    private Integer year;
    private Integer countPages;

    public Book(String nameBook, String surnameAuthor, Integer price, Integer year, Integer countPages) {
        this.nameBook = nameBook;
        this.surnameAuthor = surnameAuthor;
        this.price = price;
        this.year = year;
        this.countPages = countPages;
    }
}
