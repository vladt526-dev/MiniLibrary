import java.util.ArrayList;
import java.util.List;

class User {
    private final String name;
    private final List<Book> borrowed = new ArrayList<>();

    public User(String name) { this.name = name; }
    public String getName() { return name; }
    public void borrowBook(Book b) { borrowed.add(b); }
    public void returnBook(Book b) { borrowed.remove(b); }

    @Override
    public String toString() {
        if (borrowed.isEmpty()) return name + " — нічого не має";
        return name + " має: " + borrowed.stream().map(Book::getTitle).toList();
    }
}