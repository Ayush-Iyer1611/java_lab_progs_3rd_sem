class Box {
double width;
double height;
double depth;
}

class Program32 {
public static void main(String[] args) {
Box b1 = new Box();
b1.width = 10;
b1.height = 20;
b1.depth = 30;
Box b2 = b1;
System.out.println("Before changing b2:");
System.out.println("b1 width = " + b1.width);
System.out.println("b2 width = " + b2.width);
b2.width = 100;
System.out.println();
System.out.println("After changing b2:");
System.out.println("b1 width = " + b1.width);
System.out.println("b2 width = " + b2.width);
}
}
