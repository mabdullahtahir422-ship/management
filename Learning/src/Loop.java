import java.util.*;
public class Loop {
    public static void main(String[] args ){
        Random rand = new Random();
        int num1 = rand.nextInt(9) +1;
        int num2 = rand.nextInt(9) +1;

        Scanner sc = new Scanner(System.in);
        int sum = num1+num2;
        System.out.print("What is " +num1 +"+" +num2 +"?");
        int answer = sc.nextInt();
        while(answer != sum){
            System.out.println("Wrong answer   Try again  What is " +num1 +"+" +num2 +"?" );
            answer = sc.nextInt();
        }
        System.out.println("You got it " +num1 +"+" +num2 +"=" +sum);
    }
}
