public class End {
    public static void main(String[] args) {
        int outer = 1;
        while (outer <= 5) {
            int num = (2 * outer) - 1; //1 3 5 7 9

            int dash = 6 - outer;
            int j = 1;   //Left slash
            while (j <= dash) {
                System.out.print("-");
                j++;
            }


            int k = 1;  //print num
            while (k <= num) {
                System.out.print(num);
                k++;
            }

            int l = 1;   //Right slash
            while (l <= dash) {
                System.out.print("-");
                l++;
            }

            System.out.println();
            outer++;
        }
    }
}