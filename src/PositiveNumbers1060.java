
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
public class PositiveNumbers1060 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int count = 0;

        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }

        for (int n = 0; n < a.length; n++) {
            if (a[n] > 0) {
                count++;
            }
        }
        System.out.printf("%d valores positivos\n", count);

    }
}
