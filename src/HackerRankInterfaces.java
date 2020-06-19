
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
public class HackerRankInterfaces {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        int n = 6;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int devisor = n / i;
                sum += devisor;

            }
        }
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sum);

    }
}
