
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
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long minSum = 0;
        long  maxSum = 0;
        int n = sc.nextInt();
        int[] a = new int[n];
        int temp;
        for (int i = 0; i < a.length; i++) {
            int input = sc.nextInt();
            a[i] = input;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.printf("\n");
        for (int k = 0; k < a.length - 1; k++) {
            minSum = minSum + a[k];
        }

        System.out.printf("\n");
        for (int k = 1; k < a.length; k++) {
            maxSum = maxSum + a[k];
        }

        System.out.println(minSum + " " + maxSum);
    }

}
