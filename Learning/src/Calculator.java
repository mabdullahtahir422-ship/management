import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + ((double) num1 / num2));
                } else {
                    System.out.println("Error! No enter zero.");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}