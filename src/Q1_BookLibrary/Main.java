package Q1_BookLibrary;


public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        library.addBook(new Book("1984", "George Orwell", "9780451524935"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467"));

        Book foundBook = library.searchByTitle("1984");


        if (foundBook != null) {
            System.out.println("Book found:");
            foundBook.printDetails();
        } else {
            System.out.println("Book not found.");
        }
    }
}
