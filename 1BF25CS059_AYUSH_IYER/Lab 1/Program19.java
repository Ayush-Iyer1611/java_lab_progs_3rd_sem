import java.util.Scanner;
class Program19 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter temperature in Fahrenheit:");
double fahrenheit = in.nextDouble();
double celsius = ((fahrenheit - 32) * 5) / 9;
System.out.println("Temperature in Celsius = " + celsius);
in.close();
}
}
