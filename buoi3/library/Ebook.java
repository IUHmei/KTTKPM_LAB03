package buoi3.library;

public class Ebook extends Book {
    public Ebook(String title, String author) {
        super(title, author);
    }

    public void display() {
        System.out.println("Ebook: " + title);
    }
}