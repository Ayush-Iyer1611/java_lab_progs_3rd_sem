import java.util.Scanner;
class Program17 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter an integer to check if it is odd or even:");
int x = in.nextInt();
if (x % 2 == 0) {
System.out.println("You entered an even number.");
} else {
System.out.println("You entered an odd number.");
}
in.close();
}
}
