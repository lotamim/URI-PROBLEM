
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
public class diagonalsHackerRank {

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int d1 = 0, d2 = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    d1 += a[i][j];
//                    System.out.println("i==j " + a[i][j] + " ");
                }
                if (i == 3 - j - 1) {
                    d2 += a[i][j];
//                    System.out.println("i==3-j-1 " + a[i][j] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("Hello = " + Math.abs(d1 - d2));

    }
}
