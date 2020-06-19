
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Taminm
 */
public class SumofConsecutiveOddNumbersIII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X;
        int Y;
        int N = sc.nextInt();

        for (int k = 1; k <= N; k++) {
            int total = 0;
            int sum;
            X = sc.nextInt();
            Y = sc.nextInt();
            for (int i = X; i < (X + (Y * 2)); i += 2) {
                sum = 0;
                int j = i;
                if (i % 2 == 0) {
                    j = i + 1;
                    sum += j;
                } else {
                    sum += j;
                }
                total += sum;
            }
            System.out.println(total);
        }

    }
}
