 	
class Book {
    String title;
    String author;
    double price;
    static String publisher = "ABC Publications";

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;

        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Publisher: " + publisher);
    }
}

public class question5 {
    public static void main(String[] args) {
        String title = "Java Programming";
        String author = "James Gosling";
        double price = 599;

        Book b = new Book(title, author, price);
        b.display();
    }
}
