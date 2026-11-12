import java.util.Scanner;

class A {
    int i;
}

class B extends A {
    int i; // Hides the i in superclass A

    B(int a, int b) {
        super.i = a; // i in superclass
        i = b;       // i in subclass
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for superclass i: ");
        int a = sc.nextInt();

        System.out.print("Enter value for subclass i: ");
        int b = sc.nextInt();

        B subOb = new B(a, b);

        System.out.println("\n--- Variable Values ---");
        subOb.show();

        sc.close();
    }
}


// Program 5 - superclass and subclass variables
// javac Program5.java
// java Program5