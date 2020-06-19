
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
public class PrimeNumber1165 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 1; k <= n; k++) {
            int flag = 1;
            int input = sc.nextInt();
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.printf("%d eh primo\n", input);
            } else {
                System.out.printf("%d nao eh primo\n", input);
            }

        }
        

    }

}
