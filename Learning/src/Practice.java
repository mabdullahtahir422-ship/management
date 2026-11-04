                                        //while loop

/*import java .util.Scanner;
import java.util.Random;
public class Practice {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        System.out.println("What is num1 + numb2 ?");
        int input = sc.nextInt();
        while(num1 + num2 != input ){
            System.out.println("wrong. What is num1 + num2 = ? ");
            input = sc.nextInt();
        }
        System.out.println("You got it.");
    }
}
*/




                                        //counter control loop
/*import java .util.Scanner;
public class Practice {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("how much number do you want to enter to calculate the sum  or average. ");
        int input = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=input){
            System.out.println("Number is: ");
            int num = sc.nextInt();
            sum = sum + input ;
            i++;
        }
        System.out.println("The Sum is: " +sum );
        int average = sum/input;
        System.out.println("The average is: " +average );
    }
}*/




                                        //sentinal control loop
/*import java .util.Scanner;
public class Practice {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive integer ending with -999.");
        final int sentinalNumber = -999;
        int sum = 0;
        int count = 0;
        int input = sc.nextInt();
        while(input!=sentinalNumber){
            sum = sum + input;
            count++;
            input = sc.nextInt();
        }
        System.out.println("The sum is: " +sum);
        int average = (sum / input);
        System.out.println("The average is: " +average);
   }
   }
 */






                                               //flaf counter loop
 /*import java .util.Scanner;
 import java .util.Random;
public class Practice {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100);
        System.out.println("enter integer (0 - 100).");
        boolean done = false;
        while(!done){
            System.out.println("enter number.");
            int input = sc.nextInt();

         if(input==num){
             System.out.println("correct.");
             done = true;
         }
        else if(input<num && input>100){
            System.out.println("Invalid number");
        }
        else if(num>input){
            System.out.println("Number is greater");
        }
        else if(num<input){
            System.out.println("Number is lower ");
        }
    }
    }
}*/





                                      /*  //for loop
                                        import java .util.Scanner;
                                        public class Practice {
                                            public static void main (String[] args){
                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Enter integer to calculate sum");
                                                int sum = 0;
                                                for(int i = 1; i<=5; i++){
                                                    System.out.println("Enter integer: ");
                                                    int num = sc.nextInt();
                                                    sum = sum + num;
                                                }
                                                System.out.println("Integer sum is : " +sum);
                                            }
                                        }*/





//table loop
/*public class Practice {
    public static void main (String[] args) {
        System.out.println("Multiplication table");
        for(int i = 1; i<=9; i++){
            System.out.print("  " +i);
        }
        System.out.println();
        System.out.println("----------------------------");


        for(int j = 1; j<=9; j++) {
            System.out.print(j + "|");

            for (int k = 1; k <= 9; k++) {
                System.out.print("  "+j*k);
            }
            System.out.println();
        }

    }
    }*/






                                        //break
                                         /*public class Practice {
                                            public static void main (String[] args) {
int i = 1;
while(i<=10){
    System.out.println(i);
    i++;
    if(i==5){
        break;
    }
}
                                            }
                                            }*/


/*public class Practice{
    public static void main(String [] args){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}*/

                                       /* public class Practice{
                                            public static void main(String [] args){
                                                int n=6;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<=n-i; j++){
                                                        System.out.print("*");
                                                    }
                                                    System.out.println("");
                                                }
                                            }
                                        }*/






                                     /*   public class Practice{
                                            public static void main(String [] args){
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<=i; j++ ){
                                                        System.out.print(i);
                                                    }
                                                    System.out.println("");
                                                }
                                            }
                                        }*/



                                        /*public class Practice{
                                            public static void main(String [] args){
                                                int colume = 5;
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<=colume; j++ ){
                                                        System.out.print("*");
                                                    }
                                                    System.out.println("");
                                                }
                                            }
                                        }*/





                                   /*     public class Practice{
                                            public static void main(String [] args){
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<=n-i; j++){
                                                        System.out.print(" ");
                                                    }
                                                    for(int k=1; k<=(2*i)-1; k++ ){
                                                        System.out.print(i);
                                                    }
                                                    System.out.println(" ");
                                                }
                                            }
                                        }*/





                                      /*  public class Practice{
                                            public static void main(String [] args){
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    int oddnum = (2*i)-1;
                                                    for(int j=1; j<=n-i; j++){
                                                        System.out.print(" ");
                                                    }
                                                    for(int k=1; k<=oddnum; k++ ){
                                                        System.out.print(oddnum);
                                                    }
                                                    System.out.println(" ");
                                                }
                                            }
                                        }*/




                                       /* public class Practice{
                                            public static void main(String [] args){
                                                int n=4;
                                                for(int i=1; i<=n; i++){
                                                    int evennum = (2*i);
                                                    for(int j=1; j<=n-i; j++){
                                                        System.out.print(" ");
                                                    }
                                                    for(int k=1; k<=evennum; k++ ){
                                                        System.out.print(evennum);
                                                    }
                                                    System.out.println(" ");
                                                }
                                            }
                                        }*/






                                      /*  public class Practice{
                                            public static void main(String [] args){
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<=n-i; j++){
                                                        System.out.print(" ");
                                                    }
                                                    for(int k=1; k<=(2*i-1); k++ ){
                                                        System.out.print(k);
                                                    }
                                                    System.out.println(" ");
                                                }
                                            }
                                        }*/







                                       /* public class Practice{
                                            public static void main(String [] args){
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<=n-i; j++){
                                                        System.out.print(" ");
                                                    }
                                                    for(int j=1; j<=i; j++){
                                                        System.out.print("*");
                                                    }
                                                    System.out.println(" ");
                                                }
                                            }
                                        }*/




                                      /*  public class Practice{
                                            public static void main(String [] args){
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<i; j++){
                                                        System.out.print(" ");
                                                    }
                                                    for(int j=1; j<=n-i; j++){
                                                        System.out.print("*");
                                                    }
                                                    System.out.println(" ");
                                                }
                                            }
                                        }*/



                                        public class Practice{
                                            public static void main(String [] args){
                                                int n=5;
                                                for(int i=1; i<=n; i++){
                                                    for(int j=1; j<n-i; j++){
                                                        System.out.print("*");
                                                    }
                                                    System.out.println(" ");
                                                }
                                            }
                                        }