class Student {
    int rollNo;
    String name;
    int age;

    Student() {
        this(0, "Unknown", 0);
    }

    Student(int rollNo, String name) {
        this(rollNo, name, 05);
    }

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul");
        Student s3 = new Student(102, "Aman", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}