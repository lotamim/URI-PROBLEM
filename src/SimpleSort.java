
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
public class SimpleSort {

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        int temp;
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            a[i] = input;
            b[i] = a[i];
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("\n");

        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

        System.out.print("\n");

        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }

    }

}
