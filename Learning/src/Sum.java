import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("The total sum of the 5 numbers is: " + sum);
    }
}