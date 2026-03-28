package buoi3.library;

import java.util.List;

public class SearchByAuthor implements SearchStrategy {
    public void search(List<Book> books, String keyword) {
        for (Book b : books) {
            if (b.author.contains(keyword)) {
                b.display();
            }
        }
    }
}