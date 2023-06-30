package Home;

import java.util.*;

public class Main {
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
                "0. Подтвердить параметры фильтра");
        Map<String, String> criterion = criterionDict();
        notebooks = filterNotebook(notebooks, criterion);
        System.out.println(notebooks);
    }
    private static Map<String, String> criterionDict() {
        Scanner in = new Scanner(System.in);
        Map<String, String> criterion = new HashMap<>();
        int num = in.nextInt();
        while (num != 0) {
            switch (num) {
                case 1 -> {
                    System.out.println("Введите минимальную диагональ экрана: ");
                    String temp = in.next().trim();
                    criterion.put("Screen", temp);
                }
                case 2 -> {
                    System.out.println("Введите производителя: ");
                    String temp = in.next().trim().toLowerCase();
                    criterion.put("Manufacturer", temp);
                }
                case 3 -> {
                    System.out.println("Введите цвет: ");
                    String temp = in.next().trim().toLowerCase();
                    criterion.put("Color", temp);
                }
                case 4 -> {
                    System.out.println("Введите минимальный объем ОЗУ: ");
                    String temp = in.next().trim();
                    criterion.put("RAM", temp);
                }
                case 5 -> {
                    System.out.println("Введите минимальный объем ЖД: ");
                    String temp = in.next().trim();
                    criterion.put("SSD", temp);
                }
                case 6 -> {
                    System.out.println("Введите операционную систему: ");
                    String temp = in.next().trim().toLowerCase();
                    criterion.put("OS", temp);
                }
                case 7 -> {
                    System.out.println("Введите минимальную цену: ");
                    String temp = in.next().trim();
                    criterion.put("Price", temp);
                }
                default -> {
                    System.out.println("Введено некорректное значение");
                }
            }
            System.out.println("Следующий критерий: ");
            num = in.nextInt();
        }
        return criterion;
    }
    private static List<Notebook> filterNotebook(List<Notebook> notebooks, Map<String, String> criterion) {
        for (Map.Entry<String, String> entry : criterion.entrySet()) {
            if (entry.getKey().equals("Screen")) notebooks = Filter.filterScreen(notebooks, entry.getValue());
            if (entry.getKey().equals("Manufacturer"))
                notebooks = Filter.filterManufacturer(notebooks, entry.getValue());
            if (entry.getKey().equals("Color")) notebooks = Filter.filterColor(notebooks, entry.getValue());
            if (entry.getKey().equals("RAM")) notebooks = Filter.filterRAM(notebooks, entry.getValue());
            if (entry.getKey().equals("SSD")) notebooks = Filter.filterSSD(notebooks, entry.getValue());
            if (entry.getKey().equals("OS")) notebooks = Filter.filterOS(notebooks, entry.getValue());
            if (entry.getKey().equals("Price")) notebooks = Filter.filterPrice(notebooks, entry.getValue());
        }
        return notebooks;
    }
}