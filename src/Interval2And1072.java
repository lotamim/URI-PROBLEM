
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
public class Interval2And1072 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int[] X = new int[N];

        int inCount = 0;
        int outCount = 0;

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        for (int i = 0; i < X.length; i++) {
            if (X[i] >= 10 && X[i] <= 20) {
                inCount++;
            } else {
                outCount++;
            }
        }

        System.out.println(inCount + " in");
        System.out.println(outCount + " out");
        

    }
}
