class Student {
    int rollNo;
    String name;

    static String college = "BMS College of Engineering";
    static int count = 0;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        count++;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println();
    }

    static void displayCount() {
        System.out.println("Total students: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Aman");
        Student s3 = new Student(103, "Arjun");

        s1.display();
        s2.display();
        s3.display();

        Student.displayCount();
    }
}