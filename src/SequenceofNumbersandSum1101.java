
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
public class SequenceofNumbersandSum1101 {

    public static void main(String[] args) {
        int M = 0;
        int N = 0;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            M = sc.nextInt();
            N = sc.nextInt();
            if (M > N) {
                int temp = M;
                M = N;
                N = temp;
            }

            if (M > 0 && N > 0) {
                for (int i = M; i <= N; i++) {
                    sum += i;
                    System.out.printf("%d ", i);
                }
                System.out.printf("Sum=%d\n", sum);
                sum = 0;
            } else {
                break;
            }
        }

    }
}
