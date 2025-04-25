package Q1_BookLibrary;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    // Constructor initializes the books list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(Book book) {
        books.add(book); // Add the book to the ArrayList
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
}
