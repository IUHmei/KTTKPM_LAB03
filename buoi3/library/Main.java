package buoi3.library;


public class Main {
    public static void main(String[] args) {

        Library lib = Library.getInstance();

        // Factory
        Book b1 = BookFactory.createBook("paper", "Java", "A");
        Book b2 = BookFactory.createBook("ebook", "Python", "B");

        lib.addBook(b1);
        lib.addBook(b2);

        // Strategy
        SearchStrategy search = new SearchByTitle();
        search.search(lib.getBooks(), "Java");

        // Observer
        Observer user = new User("Khoa");
        lib.attach(user);
        lib.notifyObservers("Có sách mới!");

        // Decorator
        Borrow borrow = new BasicBorrow();
        borrow = new ExtendTime(borrow);
        borrow.borrow();
    }
}