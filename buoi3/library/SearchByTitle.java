package buoi3.library;

import java.util.List;

public class SearchByTitle implements SearchStrategy {
    public void search(List<Book> books, String keyword) {
        for (Book b : books) {
            if (b.title.contains(keyword)) {
                b.display();
            }
        }
    }
}
