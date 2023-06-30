package Home;


import java.util.LinkedList;
import java.util.List;

public class DB {
    public static List<Notebook> addData() {
        List<Notebook> notebook = new LinkedList<>();
        Notebook notebook1 = new Notebook(14.1, "DEXP", "серебристый", 8, 128, "windows", 16699);
        Notebook notebook2 = new Notebook(15.6, "Irbis", "черный", 4, 128, "linux", 21999);
        Notebook notebook3 = new Notebook(14.0, "ASUS", "серый", 4, 256, "windows", 22999);
        Notebook notebook4 = new Notebook(13.3, "Irbis", "черный", 2, 32, "none", 13999);
        Notebook notebook5 = new Notebook(14.1, "Digma", "серый", 4, 64, "linux", 16699);
        notebook.add(notebook1);
        notebook.add(notebook2);
        notebook.add(notebook3);
        notebook.add(notebook4);
        notebook.add(notebook5);
        return notebook;
    }
}
