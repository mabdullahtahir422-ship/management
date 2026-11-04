import java.util.Scanner;
public class Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;}
        if (a < c) {
            temp = a;
            a = c;
            c = temp;}
        if (b < c) {
            temp = b;
            b = c;
            c = temp;}
        System.out.println("Decreasing order: " + a + ", " + b + ", " + c);}
}
