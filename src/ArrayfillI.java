
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
public class ArrayfillI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int count = 1;
        int V = sc.nextInt();
        if (V < 50) {

            for (int i = 0; i < 10; i++) {

                if (N[0] == 0) {
                    N[0] = V;
                } else {
                    N[i] = N[i - 1] * 2;
                }

            }

            for (int i = 0; i < N.length; i++) {
                System.out.println("N[" + i + "] = " + N[i]);
            }

        }
    }
}
