import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class GarbageDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        Student s1 = new Student(name1);
        Student s2 = new Student(name2);

        System.out.println("\nStudent details:");
        s1.display();
        s2.display();

    
        s1 = null;
        s2 = null;

        System.out.println("\nObjects are now eligible for garbage collection.");

        System.gc();

        System.out.println("End of program.");

        sc.close();
    }
}