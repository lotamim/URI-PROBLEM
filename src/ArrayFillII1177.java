
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
public class ArrayFillII1177 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] N = new int[1000];
        int T = sc.nextInt();
        int count = T;

        for (int i = 0; i < N.length; i++) {
            if (count == 0) {
                count = T;
            }
            if (count <= T) {
                N[i] = T - count;
                count--;
            }

        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

    }
}
