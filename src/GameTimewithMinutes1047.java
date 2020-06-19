
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
public class GameTimewithMinutes1047 {

//    O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)
    /*
     (initial hour, initial minute, final hour, final minute
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int hi, hf, mi, mf;
//        hi = sc.nextInt();
//        mi = sc.nextInt();
//        hf = sc.nextInt();
//        mf = sc.nextInt();
//        int h = hf - hi;
//        int m = mf - mi;
//        if (h <= 0 && m <= 0) {
//            h += 24;
//        }
//        if (m < 0) {
//            h--;
//            m += 60;
//        }
//        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h, m);

        int initial_hour = sc.nextInt();
        int initial_minute = sc.nextInt();
        int final_hour = sc.nextInt();
        int final_minute = sc.nextInt();

        int duration_hour = final_hour - initial_hour;
        int duration_minute = final_minute - initial_minute;

        if (duration_hour <= 0) {
            duration_hour = 24 + (final_hour - initial_hour);
        }
        if (duration_minute < 0) {
            duration_minute = 60 + (final_minute - initial_minute);
//            duration_hour--;
            duration_hour = duration_hour / 60;
        }
//        if (initial_hour == final_hour && initial_minute == final_minute) {
//            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
//        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duration_hour, duration_minute);

    }

}
