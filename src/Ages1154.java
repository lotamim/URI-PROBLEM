
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
public class Ages1154 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int count = 0;
        while (true) {
            n = sc.nextInt();
            if (n < 0) {
                break;
            } else {
                total += n;
                count++;
            }

        }
        double avg = total / (double) count;
        System.out.printf("%.2f\n", avg);
    }
}
