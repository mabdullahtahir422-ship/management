import java.util.Scanner;
public class List {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integer in the list : ");
        int num = sc.nextInt();
        System.out.println("Enter " +num +"Integer");
        int count = 0;
        int Sum = 0;
        while(count<num){
            int loop = sc.nextInt();
             Sum += loop;
             count++;
        }
        System.out.println("The sum of " +num +"number " +"=" +Sum);
        System.out.println("The average is " +Sum/num);
    }
}
