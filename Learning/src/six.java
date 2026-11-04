import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEmployee " + i + ":");
            System.out.print("Enter hours worked: ");
            int hoursWorked = input.nextInt();
            System.out.print("Enter hourly rate: ");
            double hourlyRate = input.nextDouble();
            double grossPay;
            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * (hourlyRate * 1.5));
            }
            System.out.println("Gross Pay is: $" + grossPay);
        }

        input.close();
    }
}