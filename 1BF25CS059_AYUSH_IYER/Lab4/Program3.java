import java.util.Scanner;

class Animal {
    String color;
    String animalSound;

    Animal(String color, String animalSound) {
        this.color = color;
        this.animalSound = animalSound;
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound: " + animalSound);
    }
}

class Dog extends Animal {
    String color;
    String dogSound;

    Dog(String animalColor, String animalSound,
        String dogColor, String dogSound) {
        super(animalColor, animalSound);
        this.color = dogColor;
        this.dogSound = dogSound;
        System.out.println("Dog constructor");
    }

    void display() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
        super.sound();
    }

    @Override
    void sound() {
        System.out.println("Dog sound: " + dogSound);
    }
}

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter animal color: ");
        String animalColor = sc.nextLine();

        System.out.print("Enter animal sound: ");
        String animalSound = sc.nextLine();

        System.out.print("Enter dog color: ");
        String dogColor = sc.nextLine();

        System.out.print("Enter dog sound: ");
        String dogSound = sc.nextLine();

        Dog d = new Dog(animalColor, animalSound,
                        dogColor, dogSound);

        System.out.println("\n--- Animal and Dog Details ---");
        d.display();

        System.out.println("\n--- Overridden Method ---");
        d.sound();

        sc.close();
    }
}


// Program 3 - super keyword and method overriding
// javac Program3.java
// java Program3