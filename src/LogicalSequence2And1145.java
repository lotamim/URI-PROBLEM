
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
public class LogicalSequence2And1145 {
    public static void main(String[] args) {
        int X = 0;
        int Y = 0;
        Scanner sc = new Scanner(System.in);
        int count = 1;

        X = sc.nextInt(); // column
        Y = sc.nextInt(); // row
//        int k = Y / X;
//
//        for (int i = 1; i <= k; i++) {
//            for (int j = 1; j <= X; j++) {
//                System.out.printf("%d ", count);
//                count++;
//            }
//            System.out.print("\n");
//        }

        int k = Y / X;
        int l = X;

        for (int i = 1; i <= k; i++) {
            System.out.printf("%d", count);

            for (int j = count + 1; j <= l; j++) {
                System.out.printf(" %d", j);
//                count++;
            }
            System.out.print("\n");
            count += X;
            l += X;
        }
        
    }
}
