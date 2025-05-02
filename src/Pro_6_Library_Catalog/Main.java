
//Problem 6: Library Catalog (Map<String, Set<Book>>)
//Each genre maps to a set of Book objects.
//•	Prevent duplicate books using equals and hashCode.
//•	Print all books in a genre, sorted by publication year.


package Pro_6_Library_Catalog;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addBook("Comedy", new Book("Hera Pheri", "Neeraj Vora", 2000));
        catalog.addBook("Comedy", new Book("Hungama", "Priyadarshan", 2003));
        catalog.addBook("Comedy", new Book("3 Idiots", "Rajkumar Hirani", 2009));

        catalog.addBook("Fantasy", new Book("Tumbbad", "Rahi Anil Barve", 2018));
        catalog.addBook("Fantasy", new Book("A Game of Thrones", "George R. R. Martin", 1996));
        catalog.addBook("Fantasy", new Book("Krrish", "Rakesh Roshan", 2006));

        catalog.addBook("Mystery", new Book("Drishyam", "Nishikant Kamat", 2015));

        catalog.addBook("Mystery", new Book("Drishyam", "Nishikant Kamat", 2015));

        System.out.println();
        catalog.printBooksByGenre("Fantasy");
        System.out.println();
        catalog.printBooksByGenre("Comedy");
        System.out.println();
        catalog.printBooksByGenre("Mystery");
    }
}

