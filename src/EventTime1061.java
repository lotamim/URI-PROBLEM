
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamim
 */
public class EventTime1061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_day = sc.nextInt();
        int start_hour = sc.nextInt();
        int start_minute = sc.nextInt();
        int start_second = sc.nextInt();

        int end_day = sc.nextInt();
        int end_hour = sc.nextInt();
        int end_minute = sc.nextInt();
        int end_second = sc.nextInt();

        int day_duration = end_day - start_day;
        int hour_duration = end_hour - start_hour;
        int minute_duration = end_minute - start_minute;
        int second_duration = end_second - start_second;

        if (hour_duration < 0) {
            hour_duration += 24;
            day_duration--;
        }
        if (minute_duration < 0) {
            minute_duration += 60;
            hour_duration--;
        }
        if (second_duration < 0) {
            second_duration += 60;
            minute_duration--;
        }

        System.out.printf("%d dia(s)\n", day_duration);
        System.out.printf("%d hora(s)\n", hour_duration);
        System.out.printf("%d minuto(s)\n", minute_duration);
        System.out.printf("%d segundo(s)\n", second_duration);

    }

}
