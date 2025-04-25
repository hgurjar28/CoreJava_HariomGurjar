package Q1_BookLibrary;

public class Book {

    private String title;
    private String author;
    private String ISBN;

    // Constructor to initialize a new Book object
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
}
    public String getTitle() {
        return title;
    }
}