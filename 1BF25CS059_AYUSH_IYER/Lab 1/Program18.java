import java.util.Scanner;
class Program18 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int n;
System.out.println("Input an integer:");
while ((n = input.nextInt()) != 0) {
System.out.println("You entered " + n);
System.out.println("Input an integer:");
}
System.out.println("Out of loop");
input.close();
}
}
