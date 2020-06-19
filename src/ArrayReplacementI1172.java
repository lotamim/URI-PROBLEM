
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
public class ArrayReplacementI1172 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n <= 0) {
                X[i] = 1;
            } else {
                X[i] = n;
            }
        }

        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }

    }
}
