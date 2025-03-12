class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    // Constructor
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    // Method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("978-243-000-101", "Java Programming", "RK Singh");
        book1.displayBookDetails();

        Book book2 = new Book("978-243-000-102", "Data Structures", "SP Shukla");
        book2.displayBookDetails();

        Book.displayLibraryName();
    }
}

/*
Output:
    ISBN: 978-243-000-101
    Title: Java Programming
    Author: RK Singh
    ISBN: 978-243-000-102
    Title: Data Structures
    Author: SP Shukla
    Library Name: Central Library
 */