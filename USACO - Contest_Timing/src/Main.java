
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input is end time
        //format: day --> hour --> minute

        System.out.println("Enter the day");
        int day = sc.nextInt();

        System.out.println("Enter the hour number");
        int hour = sc.nextInt();

        System.out.println("Enter the minute number");
        int minute = sc.nextInt();

        //given starting time: 11:11 am, November 11
        final int start_day = 11;
        final int start_hour =11;
        final int start_minute =11;
        final int start_time = 11*60*24 + 11*60 + 11;//as minutes

        //output the number of minutes spent or -1 if ending time is earlier than starting time

        int end_time = day*60*24 + hour*60 + minute;

        int time_dif = end_time-start_time;

        if(time_dif <0){
            System.out.println("-1");
        }
        else{
            System.out.println("Time spent: " + time_dif);
        }


        //finished, correct






    }
}