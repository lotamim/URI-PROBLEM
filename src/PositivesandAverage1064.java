
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamin
 */
public class PositivesandAverage1064 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int count = 0;
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }

        for (int n = 0; n < a.length; n++) {
            if (a[n] > 0) {
                sum = sum + a[n];
                count++;
            }
        }
        double avg = sum / count;
        System.out.printf("%d valores positivos\n", count);
        System.out.printf("%.1f\n", avg);

//        double a[7];
//    int i, count = 0;
//        int sum = 0;
//        for (i = 0; i < 6; i++) {
//            scanf("%lf",  & a[i]);
//            if (a[i] > 0) {
//                sum = sum + a[i];
//                count++;
//            }
//        }
//        double avg = sum / count;
//        printf("%d valores positivos\n", count);
//        printf("%.1lf\n", avg);
//        return 0;
    }
}
