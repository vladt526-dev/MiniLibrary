import java.util.ArrayList;
import java.util.List;

class Librarian {
    private final List<String> actions = new ArrayList<>();

    public void registerAction(User user, Book book, String action) {
        actions.add(user.getName() + " " + action + " \"" + book.getTitle() + "\"");
    }

    public void showActions() {
        System.out.println("\n Журнал дій:");
        actions.forEach(a -> System.out.println(" • " + a));
    }

    public void issueBook(User user, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            user.borrowBook(book);
            System.out.println( user.getName() + " отримав книгу \"" + book.getTitle() + "\"");
            registerAction(user, book, "взяв книгу");
        } else {
            System.out.println(" Книга \"" + book.getTitle() + "\" недоступна для " + user.getName() + "!");
        }
    }

    public void returnBook(User user, Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            user.returnBook(book);
            System.out.println( user.getName() + " повернув книгу \"" + book.getTitle() + "\"");
            registerAction(user, book, "повернув книгу");
        }
    }
}

