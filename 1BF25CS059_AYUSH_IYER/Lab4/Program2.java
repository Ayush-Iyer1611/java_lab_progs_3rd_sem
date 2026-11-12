import java.util.Scanner;

class Student {
    private int age;

    Student(int age) {
        this.age = age;
    }

    private void display() {
        System.out.println("Age: " + age);
    }

    public void show() {
        display();
    }
}

class Main2 extends Student {
    Main2(int age) {
        super(age);
    }

    void testAccess() {
        System.out.println("Cannot access private variable age");
        System.out.println("Cannot access private method display()");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age for private access test: ");
        int age1 = sc.nextInt();

        Main2 obj1 = new Main2(age1);

        System.out.println("\nOutput 1 - Direct private access:");
        obj1.testAccess();

        System.out.print("\nEnter age for public method access: ");
        int age2 = sc.nextInt();

        Main2 obj2 = new Main2(age2);

        System.out.println("\nOutput 2 - Access through public method:");
        obj2.show();

        sc.close();
    }
}

// Program 2 - private access modifier
// javac Program2.java
// java Main2
