/*import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step i & ii: User se inputs lena aur store karna
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Step iii: Subtotal calculate karna
        double subtotal = quantity * pricePerItem;

        // Step iv: Charge rate (2 + last digit of roll number 4 = 6%)
        double chargeRate = 6.0;

        // Step v: Packing charge amount calculate karna
        double chargeAmount = (subtotal * chargeRate) / 100.0;

        // Step v & vii: Final total (Formula: finalTotal = subtotal + chargeAmount)
        double finalTotal = subtotal + chargeAmount;

        // Step vi: Easy-to-read receipt display karna using printf
        System.out.println("\n-----------------------------------");
        System.out.println("          STORE RECEIPT            ");
        System.out.println("-----------------------------------");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price Per Item: $%.2f%n", pricePerItem);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Packing Charge (%.0f%%): $%.2f%n", chargeRate, chargeAmount);
        System.out.println("-----------------------------------");
        System.out.printf("Final Total: $%.2f%n", finalTotal);
        System.out.println("-----------------------------------");

        scanner.close();
    }
}*/
/*import java.util.*;
public class last{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1  , num2  ;
        System.out.print("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = sc.nextInt();
        System.out.println(+num1==num2);
        System.out.println(num1 != num2);
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 % num2);

    }
}*/

/*import java.util.*;
public class last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2 ,;
        System.out.print("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = sc.nextInt();
        if(num1 < num2){
            System.out.print("NUmber1 is smaller");
        }
        else if(num1==num2){
            System.out.print("Both number are equal. ");
        }
        else{
            System.out.print("NUmber2 is smaller");
        }
    }
}*/


import java.util.*;
public class last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            if (num < 0) {
                System.out.println("This is an  negative even  number ");
            } else {
                System.out.println("This is an positive even  number ");
            }
            System.out.print("This is an even  number: ");
        } else {
            System.out.println("This is an odd number ");
            if (num < 0) {
                System.out.print("This is an  negative odd number: ");
            } else {
                System.out.print("This is an positive odd number: ");
            }
        }
    }
}
