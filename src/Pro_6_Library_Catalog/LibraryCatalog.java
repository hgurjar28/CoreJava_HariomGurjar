package Pro_6_Library_Catalog;

import java.util.*;

public class LibraryCatalog {
    private Map<String, Set<Book>> genreMap = new HashMap<>();


    public void addBook(String genre, Book book) {
        if (genreMap.containsKey(genre)) {
            Set<Book> s = genreMap.get(genre);

            s.add(book);
            genreMap.put(genre, s);
        } else {
            Set<Book> s = new HashSet<>();
            s.add(book);
            genreMap.put(genre, s);
        }
    }

    public void printBooksByGenre(String genre) {
        Set<Book> books = genreMap.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
            return;
        }

        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparingInt(Book::getPublicationYear));

        System.out.println("Books in genre: " + genre);
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}
