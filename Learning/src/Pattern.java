public class Pattern {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int space = 1;
            while (space <= (5 - i)) {
                System.out.print(" ");
                space++;}
            int count = 1;
            while (count <= i) {
                System.out.print(i);
                count++;}
            System.out.println();
            i++;}}}