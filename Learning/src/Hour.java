/*import java.util.*;
public class Hour {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int mint = sc.nextInt();
        int hour = mint/60;
        int mints = mint%60;
        System.out.println("total hours is: " +hour +":" +mints);
    }
}
*/
/*import java.util.*;
public class Hour {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hour = sc.nextInt();
        System.out.println("Enter Mints: ");
        int mints = sc.nextInt();
        int totalMints = hour * 60 + mints;
        System.out.println("Enter Mints is : " +totalMints);
    }
}*/

/*import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = sc.nextInt();
        if((num<num2 && num<num3)){
            System.out.println("Smallest number is : " +num);
        }
        else if(num2<num && num2<num3){
            System.out.println("Smallest number is : " +num2);
        }
        else {
            System.out.println("Smallest number is : " +num3);
        }
    }
}*/

/*import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println(+num +" is not prime number.");
        }
        else if(num%1==0){
            System.out.println(+num +" is prime number.");
        }
        else if((num%2==1)){
            System.out.println(+num +" is not a prime number.");
        }
    }
}*/


/*import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = sc.nextInt();
        if (num1 < num2 && num1 < num3) {
            if (num2 > num1 && num2 < num3) {
                System.out.print(num1+" ");
                System.out.print(num2+" ");
                System.out.print(num3+" ");
            }
        }
        else if(num2<num1 && num2<num3) {
                if(num1>num2 && num2<num3){
                    System.out.print(num2+" ");
                    System.out.print(num1+" ");
                    System.out.print(num3+" ");
                }
            }
        else{
            System.out.print(num3+" ");
            System.out.print(num2+" ");
            System.out.print(num1+" ");
        }
        }
    }*/


/*import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("You are a child ");
        }
        else if(age<65){
            System.out.println("You are a Adult");
        }
        else if(age>=65){
            System.out.println("You are a senior");
        }

    }
}*/

/*import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int marks = sc.nextInt();
        if (marks >= 90 && marks>70) {
            System.out.println("Excellent");}
            if (marks >= 70 && marks > 50) {
                System.out.println("Good");}
                if (marks >= 50 && marks < 50) {
                    System.out.println("OK");}
                    if (marks <= 50) {
                        System.out.println("BAD");
                    }
                    else{
                    System.out.println("Invalid");
                }
            }
    */

/*import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any char A, B, C, D, F ");
        char grade = sc.next().charAt(0);
        switch(grade){
            case 'A': {
                System.out.println("Excellent");
                break;
            }
            case 'B': {
                System.out.println("Good");
                break;
            }
            case 'C': {
                System.out.println("OK");
                break;
            }
            case 'D': {
                System.out.println("Fine");
                break;
            }

            case 'F': {
                System.out.println("Fail");
                break;
            }
            default: {
                System.out.println("Invalid grade");
            }
        }
    }
}*/

/*import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any operator +, -, *, /, % ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter First number: ");
        int marks = sc.nextInt();
        System.out.println("Enter First number: ");
        int mark2 = sc.nextInt();
        switch (operator) {
            case '+': {
                System.out.println(marks + mark2);
                break;
            }
            case '-': {
                System.out.println(marks - mark2);
                break;
            }
            case '*': {
                System.out.println(marks * mark2);
                break;
            }
            case '/': {
                System.out.println(marks/mark2);
                break;
            }

            case '%': {
                System.out.println(marks % mark2);
                break;
            }
            default: {
                System.out.println("Invalid operator");
            }
        }
    }
}*/


import java.util.*;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any number 0, 1, 2, 3, 4 ");
        int num = sc.nextInt();
        System.out.println("Enter number of books: ");
        int marks = sc.nextInt();

        switch (num) {
            case 0: {
                System.out.println("Earned 0 point.");
                break;
            }

            case 1: {
                System.out.println("Earned 5 point.");
                break;
            }

            case 2: {
                System.out.println("Earned 15 point.");
                break;
            }

            case 3: {
                System.out.println("Earned 30 point.");
                break;
            }

            case 4: {
                if (marks >= 60 ) {
                    System.out.println("Earned 60 point.");
                }
                System.out.println("Earned 60 point.");
                break;
            }

            default: {
                if(marks<0)
                System.out.println("Invalid ");
            }
        }
    }
}

