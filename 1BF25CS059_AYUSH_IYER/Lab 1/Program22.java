import java.util.Scanner;
class Program22 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter an integer to print its multiplication table:");
int n = in.nextInt();
System.out.println("Multiplication table of " + n + " is:");
for (int c = 1; c <= 10; c++) {
System.out.println(n + " * " + c + " = " + (n * c));
}
in.close();
}
}
