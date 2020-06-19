
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
public class PlusMinus {

    public static void main(String[] args) {
        int[] a = new int[6];
        int negetiveCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        float avgZero = 0;
        float avgPositive = 0;
        float avgNegetive = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            a[i] = input;
        }
        System.out.print("\n");

        //// print array
        for (int k = 0; k < a.length; k++) {
            if (a[k] < 0) {
                negetiveCount++;
            }
            if (a[k] > 0) {
                positiveCount++;
            }
            if (a[k] == 0) {
                zeroCount++;
            }
        }
        
        System.out.printf("%.6f\n", (avgPositive + positiveCount) / n);
        System.out.printf("%.6f\n", (avgNegetive + negetiveCount) / n);
        System.out.printf("%.6f\n", (avgZero + zeroCount) / n);
//        System.out.print(avgNegetive);
    }

}
