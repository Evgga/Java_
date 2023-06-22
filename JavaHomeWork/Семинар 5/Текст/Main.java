package Home;

import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Виталицй Цаль\\Desktop\\Java\\" + "Java\\src\\main\\java\\Home\\Text.txt");
        HashMap<String, Integer> findResult = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] find = scanner.nextLine().toLowerCase().trim().split("\\p{P}?[ \\t\\n\\r]+");
        scanner.close();
        findCountWord(file, findResult, find);
    }
    private static void findCountWord(File file, HashMap<String, Integer> findResult, String[] find) {
        for (String f : find) {
            findResult.putIfAbsent(f, 0);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] res = line.trim().split("\\p{P}?[ \\t\\n\\r]+");
                    for (int i = 0; i < res.length; i++) {
                        if (f.equals(res[i].toLowerCase())) findResult.put(f, findResult.get(f) + 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Map.Entry<String, Integer> entry : findResult.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
        }
    }
}