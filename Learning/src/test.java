import java.util.*;
public class test {
    public static void main(String[] args){
        String first_name;
        String last_name;
        int age;
        String city;
        double weight;
        char gender;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name: ");
        first_name = sc.nextLine();
        System.out.print("Enter Last name: ");
        last_name = sc.nextLine();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter city: ");
        city = sc.next();
        System.out.print("Enter weight: ");
        weight = sc.nextDouble();
        System.out.print("Enter gender: ");
        gender = sc.next().charAt(0);
        System.out.println("First name is : " +first_name);
        System.out.println("Last last name is : " +last_name);
        System.out.println("Age is : " +age);
        System.out.println("City is : " +city);
        System.out.println("Weight is : " +weight);
        System.out.println("Gender is : " +gender);

    }
}
