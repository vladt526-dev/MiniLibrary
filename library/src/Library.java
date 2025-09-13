import java.util.ArrayList;
import java.util.List;

class Library {
    private static int totalBooks = 0;
    private final List<Book> books = new ArrayList<>();

    public static int getTotalBooks() { return totalBooks; }

    public void addBook(Book b) {
        books.add(b);
        totalBooks++;
    }

    public void showBooks() {
        System.out.println("\n Список книг у бібліотеці:");
        books.forEach(b -> System.out.println(" • " + b));
        System.out.println("Всього книг: " + getTotalBooks());
    }
}