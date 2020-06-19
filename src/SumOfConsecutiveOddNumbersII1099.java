
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
public class SumOfConsecutiveOddNumbersII1099 {

    public static void main(String[] args) {
        int X, Y, N;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        while (i <= N) {
            int sum = 0;
            X = sc.nextInt();
            Y = sc.nextInt();
            if (X > Y) {
                int temp = X;
                X = Y;
                Y = temp;
            }
            for (int c = X + 1; c < Y; c++) {
                if (c % 2 == 1) {
                    sum = sum + c;
                }
            }
            System.out.println(sum);
            i++;
        }

    }
}
