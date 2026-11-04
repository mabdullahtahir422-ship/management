import java.util.*;
public class print {
    public static void main(String [] args){
        int first_num;
        int second_num;
        double first_double_num;
        double second_double_num;
        double third_double_num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        first_num = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        second_num = sc.nextInt();
        System.out.print("Enter 1st double number: ");
        first_double_num = sc.nextDouble();
        System.out.print("Enter 2nd double number: ");
        second_double_num = sc.nextDouble();
        System.out.print("Enter 3rd double number: ");
        third_double_num = sc.nextDouble();
        System.out.print("The 5 number average is: " +((first_num+second_num+first_double_num+second_double_num+third_double_num)/5));
    }
}
