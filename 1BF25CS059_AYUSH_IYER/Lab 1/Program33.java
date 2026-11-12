class Program33 {
double width;
double height;
double depth;
void volume() {
System.out.println("Volume is " + (width * height * depth));
}
public static void main(String[] args) {
Program33 box = new Program33();
box.width = 10;
box.height = 20;
box.depth = 15;
box.volume();
}
}
