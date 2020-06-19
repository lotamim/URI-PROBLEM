
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
public class LogicalSequence1144 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d\n", i, (i * i), (i * i * i));
            System.out.printf("%d %d %d\n", i, (i * i) + 1, (i * i * i) + 1);
        }

    }
}
