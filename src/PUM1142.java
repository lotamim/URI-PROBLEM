
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
public class PUM1142 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                System.out.printf("%d %d %d %s\n", count, count + count, count + count + count, "PUM");
            }
            if (i > 1) {
                System.out.printf("%d %d %d %s\n", count, count + 1, count + 2, "PUM");
            }
            count += 4;

        }

    }
}
