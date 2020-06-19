
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
public class EvenBetweenfiveNumbers1065 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }

        System.out.printf("%d valores pares\n", count);

    }

}
