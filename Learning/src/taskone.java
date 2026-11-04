/*import java.util.Scanner;
public class taskone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weigth in kilogram: ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in meter: ");
        double meter = sc.nextDouble();

        if(weight<=0 && meter<0){
            System.out.println("invalid input");
        }

        else {
            double bmi = weight / (meter * meter);
            System.out.println(bmi);

            if (bmi < 18.5) {
                System.out.println("under weight");
                System.out.println("minimum weight: " +weight);
            } else if (bmi<25 && bmi>18.5) {
                System.out.println("normal");
            }
            else if(bmi>25 && bmi>=30  ){
                System.out.println("overweight");
                System.out.println("minimum weight: " +(int)(weight + 0.5));
            }
        }

    }
}
*/



//
//import java.util.Scanner;
//public class taskone {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       double sum =0;
//       double discount=0;
//        for(int i=1; i<=5; i++){
//            System.out.println("enter book price: ");
//            double price = sc.nextDouble();
//            sum = sum+price;
//             discount = (price/100)*10;
//        }
//        System.out.println("display total amount: " +sum);
//        System.out.println("display total amount: " +(sum-discount));
//    }
//}

public class taskone
{
    static void pattren() {
        for(int i = 1;i<=5;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args)
    {
        pattren();
    }
}