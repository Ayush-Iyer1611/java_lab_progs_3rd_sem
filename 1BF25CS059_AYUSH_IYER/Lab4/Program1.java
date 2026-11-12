import java.util.Scanner;

class Box {
    private double width, height, depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BOX WEIGHT PROGRAM ===");

        System.out.println("\nEnter dimensions and weight for Box 1:");
        System.out.print("Width: ");
        double w = sc.nextDouble();

        System.out.print("Height: ");
        double h = sc.nextDouble();

        System.out.print("Depth: ");
        double d = sc.nextDouble();

        System.out.print("Weight: ");
        double m = sc.nextDouble();

        BoxWeight mybox1 = new BoxWeight(w, h, d, m);

        System.out.println("\nEnter side length and weight for Cube:");
        System.out.print("Side length: ");
        double len = sc.nextDouble();

        System.out.print("Weight: ");
        double cubeWeight = sc.nextDouble();

        BoxWeight mycube = new BoxWeight(len, cubeWeight);

        BoxWeight myclone = new BoxWeight(mybox1);
        BoxWeight mybox3 = new BoxWeight();

        System.out.println("\n=== RESULTS ===");
        System.out.println("Box 1 Volume: " + mybox1.volume());
        System.out.println("Box 1 Weight: " + mybox1.weight);

        System.out.println("Default Box Volume: " + mybox3.volume());
        System.out.println("Default Box Weight: " + mybox3.weight);

        System.out.println("Cube Volume: " + mycube.volume());
        System.out.println("Cube Weight: " + mycube.weight);

        System.out.println("Cloned Box Volume: " + myclone.volume());
        System.out.println("Cloned Box Weight: " + myclone.weight);

        sc.close();
    }
}


//Program 1 - super keyword and inheritance
//javac Program1.java
//java DemoSuper

