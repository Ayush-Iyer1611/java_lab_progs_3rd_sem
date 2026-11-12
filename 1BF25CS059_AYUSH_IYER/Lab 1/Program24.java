class Program24 {
public static void main(String[] args) {
int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
int sum = 0;
for (int number : numbers) {
sum += number;
}
int arrayLength = numbers.length;
double average = (double) sum / arrayLength;
System.out.println("Sum = " + sum);
System.out.println("Average = " + average);
}
}
