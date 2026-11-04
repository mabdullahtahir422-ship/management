import java.util.Scanner;
public class Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int temporary;
        if (a > b) {
            temporary = a;
            a = b;
            b = temporary;}
        if (a > c) {
            temporary = a;
            a = c;
            c = temporary;}
        if (b > c) {
            temporary = b;
            b = c;
            c = temporary;}
        System.out.println("Increasing order: " + a + ", " + b + ", " + c);}
}