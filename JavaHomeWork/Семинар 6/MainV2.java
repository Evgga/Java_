package Home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {
        List<Notebook> notebooks = DB.addData();
        System.out.println(notebooks);
        System.out.println("\nВведите цифру, соответствующую необходимому критерию фильтра: \n" +
                "1. Диагональ экрана\n" +
                "2. Производитель\n" +
                "3. Цвет\n" +
                "4. Объем ОЗУ\n" +
                "5. Объем ЖД\n" +
                "6. Операционная система\n" +
                "7. Цена\n" +
                "0. Выход");
        criterionDict(notebooks);
    }
    private static void criterionDict(List<Notebook> notebooks) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num != 0) {
            switch (num) {
                case 1 -> {
                    System.out.println("Введите минимальную диагональ экрана: ");
                    String temp = in.next().trim();
                    notebooks = Filter.filterScreen(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 2 -> {
                    System.out.println("Введите производителя: ");
                    String temp = in.next().trim().toLowerCase();
                    notebooks = Filter.filterManufacturer(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 3 -> {
                    System.out.println("Введите цвет: ");
                    String temp = in.next().trim().toLowerCase();
                    notebooks = Filter.filterColor(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 4 -> {
                    System.out.println("Введите минимальный объем ОЗУ: ");
                    String temp = in.next().trim();
                    notebooks = Filter.filterRAM(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 5 -> {
                    System.out.println("Введите минимальный объем ЖД: ");
                    String temp = in.next().trim();
                    notebooks = Filter.filterSSD(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 6 -> {
                    System.out.println("Введите операционную систему: ");
                    String temp = in.next().trim().toLowerCase();
                    notebooks = Filter.filterOS(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 7 -> {
                    System.out.println("Введите минимальную цену: ");
                    String temp = in.next().trim();
                    notebooks = Filter.filterPrice(notebooks, temp);
                    System.out.println(notebooks);
                }
                default -> {
                    System.out.println("Введено некорректное значение");
                }
            }
            System.out.println("Следующий критерий: ");
            num = in.nextInt();
        }
    }
}
