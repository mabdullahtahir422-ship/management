import java.util.Scanner;
public class Digit {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter digit (1000 - 9999): ");
     int digit = sc.nextInt();
     int d1 = digit%10;
     int rem1 = digit/10;

     int d2 = rem1%10;
     int rem2 = rem1/10;

     int d3 = rem2%10;
     int d4 = rem2/10;

     int sum = d1 + d2 + d3 + d4;
     System.out.println(+sum);

      int reversedNumber =  (d1 * 1000) + (d2 * 100) + (d3 * 10) + d4;
        System.out.print("Reversed digit: "+reversedNumber);
    }
}
