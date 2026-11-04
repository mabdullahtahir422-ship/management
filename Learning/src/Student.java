//print info
/*public class Student {
    public static void main(String[] args){
     String Stu_name = "Muhammad Abdullah";
     int Stu_age = 21;
     String Stu_city = "Vehari";
     int Stu_fsc_marks = 500;
     System.out.println("Student name is: " +Stu_name +" "+ "Student age is: " +" "+Stu_age +" "+ "Student city is: " +Stu_city +" " + "Student FSC marks is: " +Stu_fsc_marks );
       // System.out.println("Student age is: " +Stu_age);
         //  System.out.println("Student city is: " +Stu_city);
           //   System.out.println("Student FSC marks is: " +Stu_fsc_marks);

    }
}*/



//user input
/*import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Stu_name;
        int Stu_age;
        String Stu_city;
        int Stu_fsc_marks;
        System.out.println("Student name is: ");
        Stu_name = sc.nextLine();
        System.out.println("Student age is: ");
        Stu_age = sc.nextInt();
        System.out.println("Student city is: ");
        Stu_city = sc.next();
        System.out.println("Student FSC marks is: ");
        Stu_fsc_marks = sc.nextInt();

    }
}*/




// print operations
/*import java.util.*;
public class Student{
    public static void main(String[] args){
        int a , b ;
        System.out.print("Enter Two number to find addition , subtraction , multiplication and subtrction: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The sum is: " + (a+b));
        System.out.println("The subt is: " + (a-b));
        System.out.println("The multi is: " + (a*b));
        System.out.print("The Divd is: " + (a%b));
    }
}*/



// print table
import java.util.*;
public class Student{
    public static void main(String[] args) {
        int mint = 150;
        System.out.println("Total hours is: " +mint/60 +":" +mint%60);
    }
}