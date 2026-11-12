
class Book {
    // Data members
    int bookId;
    String title;
    String author;
    double price;

    
    static int totalBooks = 0;

    
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        totalBooks++;
    }

    
    void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }

   
    static void search(Book[] books, int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId) {
                System.out.println("Book found by ID:");
                b.displayBookInfo();
                return;
            }
        }

        System.out.println("Book with ID " + bookId + " not found.");
    }

    
    static void searchTITLE(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Book found by title:");
                b.displayBookInfo();
                return;
            }
        }

        System.out.println("Book with title \"" + title + "\" not found.");
    }

    
    Book costlierBook(Book other) {
        if (this.price > other.price) {
            return this;
        } else {
            return other;
        }
    }

    
    static void displayTotalBooks() {
        System.out.println("Total number of books created: " + totalBooks);
    }
}


// Main class
public class BookDemo {
    public static void main(String[] args) {

       
        Book b1 = new Book(
            101,
            "The Alchemist",
            "Paulo Coelho",
            450.00
        );

        Book b2 = new Book(
            102,
            "Atomic Habits",
            "James Clear",
            550.00
        );

        Book b3 = new Book(
            103,
            "Rich Dad Poor Dad",
            "Robert Kiyosaki",
            400.00
        );

        
        System.out.println("BOOK INFORMATION");
        System.out.println("================");

        b1.displayBookInfo();
        b2.displayBookInfo();
        b3.displayBookInfo();

        
        System.out.println("\nSEARCH BY BOOK ID");
        System.out.println("=================");

        Book.search(new Book[]{b1, b2, b3}, 102);

        
        System.out.println("\nSEARCH BY TITLE");
        System.out.println("===============");

        Book.searchTITLE(new Book[]{b1, b2, b3}, "Atomic Habits");

        
        System.out.println("\nCOSTLIER BOOK");
        System.out.println("============="); 

        Book costlier = b1.costlierBook(b2);

        System.out.println("The costlier book is:");
        costlier.displayBookInfo();

        
        System.out.println("\nTOTAL BOOKS");
        System.out.println("===========");

        Book.displayTotalBooks();
    }
}
