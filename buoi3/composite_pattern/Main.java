package buoi3.composite_pattern;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("a.txt");
        File file2 = new File("b.txt");

        Folder folder = new Folder("Documents");
        folder.add(file1);
        folder.add(file2);

        Folder root = new Folder("Root");
        root.add(folder);

        root.showDetails();
    }
}