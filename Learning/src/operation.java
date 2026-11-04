import java.util.*;
public class operation {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter Two number to perform addition , subtraction , multiplication and subtrction: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();
        System.out.println("The sum is: " + (a + b));
        System.out.println("The subt is: " + (a - b));
        System.out.println("The multi is: " + (a * b));
        System.out.print("The Divd is: " + (a % b));
    }
}
