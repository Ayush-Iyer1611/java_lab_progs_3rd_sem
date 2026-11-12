import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a;

        System.out.println("Choose an animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Animal");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                a = new Dog();
                a.sound();
                break;

            case 2:
                a = new Cat();
                a.sound();
                break;

            case 3:
                a = new Animal();
                a.sound();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}


// Program 4 - runtime polymorphism
// javac Program4.java
// java Program4