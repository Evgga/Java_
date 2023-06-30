package Home;

import java.util.LinkedList;
import java.util.List;

public class Filter {
    public static List<Notebook> filterScreen(List<Notebook> notebooks, String value) {
        double screen = Double.parseDouble(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Screen() >= screen) result.add(notebook);
        }
        return result;
    }
    public static List<Notebook> filterManufacturer(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Manufacturer().toLowerCase().equals(value)) result.add(notebook);
        }
        return result;
    }
    public static List<Notebook> filterColor(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Color().toLowerCase().equals(value)) result.add(notebook);
        }
        return result;
    }
    public static List<Notebook> filterRAM(List<Notebook> notebooks, String value) {
        Integer ram = Integer.parseInt(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.RAM() >= ram) result.add(notebook);
        }
        return result;
    }
    public static List<Notebook> filterSSD(List<Notebook> notebooks, String value) {
        Integer ssd = Integer.parseInt(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.SSD() >= ssd) result.add(notebook);
        }
        return result;
    }
    public static List<Notebook> filterOS(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.OS().toLowerCase().equals(value)) result.add(notebook);
        }
        return result;
    }
    public static List<Notebook> filterPrice(List<Notebook> notebooks, String value) {
        Integer price = Integer.parseInt(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Price() >= price) result.add(notebook);
        }
        return result;
    }
}
