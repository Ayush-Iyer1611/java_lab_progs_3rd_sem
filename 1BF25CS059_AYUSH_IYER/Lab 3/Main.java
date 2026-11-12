import java.util.Scanner;

class Book {
    int id;
    String title, author;
    double price;
    static int count = 0;

    Book(int i, String t, String a, double p) {
        id = i;
        title = t;
        author = a;
        price = p;
        count++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    boolean search(int i) {
        if (id == i)
            return true;
        else
            return false;
    }

    boolean search(String t) {
        if (title.equals(t))
            return true;
        else
            return false;
    }

    Book costlier(Book b) {
        if (price > b.price)
            return this;
        else
            return b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        Book[] b = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book " + (i + 1) + " details:");

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Title: ");
            String title = sc.next();

            System.out.print("Author: ");
            String author = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            b[i] = new Book(id, title, author, price);
        }

        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++)
            b[i].display();

        System.out.print("\nEnter ID to search: ");
        int id = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (b[i].search(id))
                b[i].display();
        }

        System.out.print("Enter title to search: ");
        String title = sc.next();

        for (int i = 0; i < n; i++) {
            if (b[i].search(title))
                b[i].display();
        }

        if (n >= 2) {
            System.out.println("Costlier Book:");
            Book c = b[0].costlier(b[1]);
            c.display();
        }

        System.out.println("Total books: " + Book.count);
    }
}