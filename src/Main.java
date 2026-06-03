import java.util.TreeSet;

class LibraryManager {
    private TreeSet<String> books = new TreeSet<>();

    public void addBook(String title) {
        books.add(title);
    }

    public void removeBook(String title) {
        books.remove(title);
    }
    public boolean isBookAvailable(String title) {
        return books.contains(title);
    }
    public void displayAllBooks() {
        System.out.println("Books in Library:");
        for (String book : books) {
            System.out.println(book);
        }
    }
    public void displayBooksStartingWith(char letter) {
        System.out.println("Books starting with '" + letter + "':");

        for (String book : books) {
            if (book.startsWith(String.valueOf(letter))) {
                System.out.println(book);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        LibraryManager library = new LibraryManager();

        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Operating Systems");
        library.addBook("Computer Networks");
        library.addBook("Java Programming");

        library.displayAllBooks();

        System.out.println("\nAvailable? "
                + library.isBookAvailable("Data Structures"));

        library.removeBook("Operating Systems");

        System.out.println("\nAfter Removing:");
        library.displayAllBooks();

        System.out.println();
        library.displayBooksStartingWith('J');
    }
}