
class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook(int quantity) {
        int requestedBooks = quantity;

        if (requestedBooks <= 0) {
            System.out.println("Invalid quantity.");
        } else if (requestedBooks <= booksAvailable) {
            booksAvailable -= requestedBooks;
            System.out.println(requestedBooks + " book(s) issued.");
        } else {
            System.out.println("Not enough books available.");
        }

        System.out.println("Available Books: " + booksAvailable);
    }

    void returnBook(int quantity) {
        int returnedBooks = quantity;

        if (returnedBooks <= 0) {
            System.out.println("Invalid quantity.");
        } else {
            booksAvailable += returnedBooks;
            System.out.println(returnedBooks + " book(s) returned.");
        }

        System.out.println("Available Books: " + booksAvailable);
    }
}

public class question30 {
    public static void main(String[] args) {
        Library library = new Library(50);

        System.out.println("Library: " + Library.libraryName);

        library.issueBook(5);
        library.returnBook(2);
    }
}
