
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
public class SumofConsecutiveEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X;

        while (true) {
            int sum = 0;
            X = sc.nextInt();
            if (X == 0) {
                break;
            } else {
                for (int i = X; i < (X + (5 * 2)); i += 2) {
                    int j = i;
                    if (i % 2 == 0) {
                        sum += j;
                    } else {
                        j = i + 1;
                        sum += j;
                    }
                }
                System.out.println(sum);
            }

        }

    }
}
