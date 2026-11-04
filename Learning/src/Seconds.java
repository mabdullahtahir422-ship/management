public class Seconds {
    public static void main(String[] args){
        int second = 3725;
        System.out.println(+3725 +" Second convert  hour , minutes and second");
        int hours = second/3600;
        int remainingMinutes = second%3600;
        int minutes = remainingMinutes/60;
        int seconds = remainingMinutes%60;
        System.out.printf("%02d:%02d:%02d",hours,minutes,seconds );
    }
}
