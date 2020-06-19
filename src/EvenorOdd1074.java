
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
public class EvenorOdd1074 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 0;
        N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (a[i] % 2 == 0) {
                    System.out.print("EVEN NEGATIVE\n");
                } else {
                    System.out.print("ODD NEGATIVE\n");
                }
            }

            if (a[i] == 0) {
                System.out.print("NULL\n");
            }

            if (a[i] > 0) {
                if (a[i] % 2 == 0) {
                    System.out.print("EVEN POSITIVE\n");
                } else {
                    System.out.print("ODD POSITIVE\n");
                }
            }
            
            

        }
    }
}
