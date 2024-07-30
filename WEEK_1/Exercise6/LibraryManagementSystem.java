package WEEK_1.Exercise6;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {
    private Book[] books;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public LibraryManagementSystem() {
        books = new Book[INITIAL_CAPACITY];
        size = 0;
    }

    // Add a book
    public void addBook(Book book) {
        if (size == books.length) {
            books = Arrays.copyOf(books, books.length * 2); // Resize array
        }
        books[size++] = book;
    }

    // Linear search to find books by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // Book not found
    }

    // Binary search to find books by title (assuming the list is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }

    // Method to sort books by title
    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        lms.addBook(new Book(2, "Moby Dick", "Herman Melville"));
        lms.addBook(new Book(3, "1984", "George Orwell"));

        System.out.println("Linear Search for '1984':");
        Book book = lms.linearSearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");

        System.out.println("\nSorting books by title...");
        lms.sortBooksByTitle();

        System.out.println("Binary Search for '1984':");
        book = lms.binarySearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");
    }
}
