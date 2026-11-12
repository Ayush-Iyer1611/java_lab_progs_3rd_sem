import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            stack.push(value);
        }

        System.out.println("Stack elements:");
        System.out.println(stack);

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop:");
        System.out.println(stack);

        sc.close();
    }
}