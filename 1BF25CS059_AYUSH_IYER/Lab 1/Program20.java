import java.util.Scanner;
class Program20 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter temperature in Celsius:");
double celsius = in.nextDouble();
double fahrenheit = (9 * celsius / 5) + 32;
System.out.println("Temperature in Fahrenheit = " + fahrenheit);
in.close();
}
}
