class Box {
double width;
double height;
double depth;
}

class Program31 {
public static void main(String[] args) {
Box mybox;
mybox = new Box();
mybox.width = 10;
mybox.height = 20;
mybox.depth = 15;
double volume = mybox.width * mybox.height * mybox.depth;
System.out.println("Volume = " + volume);
}
}
