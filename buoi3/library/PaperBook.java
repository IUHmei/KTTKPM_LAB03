package buoi3.library;

public class PaperBook extends Book {
    public PaperBook(String title, String author) {
        super(title, author);
    }

    public void display() {
        System.out.println("Sách giấy: " + title);
    }
}
