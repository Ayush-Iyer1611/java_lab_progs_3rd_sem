
import java.util.Scanner;

class Student {
    private String usn;
    private String name;

    // Method to accept student details
    public void acceptDetails(Scanner scanner) {
        System.out.print("Enter USN: ");
        usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("USN: " + usn + " | Name: " + name);
    }
}

// Main class
public class Program1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        // Accept student details
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Enter details for Student " + (i + 1) + ":");

            students[i] = new Student();
            students[i].acceptDetails(scanner);
        }

        // Display student details
        System.out.println();
        System.out.println("--- Student Information ---");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " -> ");
            students[i].displayDetails();
        }

        scanner.close();
    }
}
