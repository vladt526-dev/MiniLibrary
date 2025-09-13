public class MiniLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        Librarian librarian = new Librarian();

        Book b1 = new Book("Java Basics", "J. Smith", 2020);
        Book b2 = new Book("OOP Principles", "M. Brown", 2019);
        lib.addBook(b1);
        lib.addBook(b2);

        User u1 = new User("John");
        User u2 = new User("Anna");

        lib.showBooks();

        librarian.issueBook(u1, b1);
        librarian.issueBook(u2, b1);
        librarian.issueBook(u2, b2);

        lib.showBooks();

        librarian.returnBook(u1, b1);
        lib.showBooks();

        System.out.println("\n Користувачі:");
        System.out.println(" • " + u1);
        System.out.println(" • " + u2);

        librarian.showActions();
    }
}
