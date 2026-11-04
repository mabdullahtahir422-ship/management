import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age < 18 && age>=1) {
            System.out.println("You are a child.");
        } else if (age < 65 && age>=18) {
            System.out.println("You are an adult.");
        } else if(age>=65) {
            System.out.println("You are a senior citizen.");
        }
        else{
            System.out.println("Entered invalid age.");}}}