import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grossSales = 0.0;
        int itemNumber;
        System.out.println("Enter item number sold (1 to 4). Enter 0 to stop:");
        while (true) {
            System.out.print("Enter item number (0 to end): ");
            itemNumber = input.nextInt();
            if (itemNumber == 0) {
                break;}
            double itemValue = 0.0;
            switch (itemNumber) {
                case 1:
                    itemValue = 239.99;
                    grossSales += itemValue;
                    break;
                case 2:
                    itemValue = 129.75;
                    grossSales += itemValue;
                    break;
                case 3:
                    itemValue = 99.95;
                    grossSales += itemValue;
                    break;
                case 4:
                    itemValue = 350.89;
                    grossSales += itemValue;
                    break;
                default:
                    System.out.println("Invalid item number. Try again.");}}
        double earnings = 200 + (grossSales * 0.09);
        System.out.println("\nTotal Gross Sales: $" + grossSales);
        System.out.println("Total Earnings: $" + earnings);
        input.close();
    }
}