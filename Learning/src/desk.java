import java.util.*;
public class desk {
    public static void main(String [] args){
        int student;
        int desk;
        Scanner sc = new Scanner(System.in);
        System.out.print("First class student strength is: ");
        student = sc.nextInt();
        System.out.print("Second class student strength is:  ");
        int Student2 = sc.nextInt();
        System.out.print("Third class student strength is:  ");
        int Student3 = sc.nextInt();
        desk = (student + 1) / 2 + (Student2 + 1) / 2 + (Student3 + 1) / 2 ;
        System.out.print("Total desk is: " +desk);
    }
}
