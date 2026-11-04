public class Display{
    public static void main(String[] args){
        int rows = 6;
        int backslach = 0;
        int exa = 22;
        int slach = 0;

        int i = 0;
        while(i<rows){

            int j = 0;
            while(j<backslach){
                System.out.print("\\");
                j++;
            }

            int r = 0;
            while(r<exa){
                System.out.print("!");
                r++;
            }

            int s = 0;
            while(s<slach){
                System.out.print("/");
                s++;
            }

            System.out.println();
            backslach = backslach + 2;
            exa = exa - 4;
            slach = slach + 2;
            i++;
        }
    }
}