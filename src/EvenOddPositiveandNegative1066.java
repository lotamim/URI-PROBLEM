
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
public class EvenOddPositiveandNegative1066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        int even = 0;
        int odd = 0;
        int positive = 0;
        int negetive = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
           }
            if (a[i] < 0) {
                negetive++;
            }
            if (a[i] > 0) {
                positive++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", even);
        System.out.printf("%d valor(es) impar(es)\n", odd);
        System.out.printf("%d valor(es) positivo(s)\n", positive);
        System.out.printf("%d valor(es) negativo(s)\n", negetive);

    }
}
