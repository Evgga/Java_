/**Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.*/

package org.example.JavaHomeWork.Test_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1", "Р", 100, 2017, 300);
        Book book2 = new Book("2", "К", 500, 2013, 280);
        Book book3 = new Book("3", "М", 400, 2000, 420);
        Book book4 = new Book("5", "Д", 250, 2018, 530);
        Book book5 = new Book("6", "С", 800, 2022, 433);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        List<String> result = findBook(books);
        for (String s : result) {
            System.out.print(s + "; ");
        }
    }
    private static List<String> findBook(List<Book> books) {
        List<String> result = new ArrayList<>();
        for (Book book : books) {
            if (
                    simpleCountPage(book.getCountPages())
                            && book.getYear() >= 2010
                            && book.getSurnameAuthor().toUpperCase().contains("А")
            ) {
                result.add(book.getNameBook());
            }
        }
        return result;
    }
    private static boolean simpleCountPage(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}