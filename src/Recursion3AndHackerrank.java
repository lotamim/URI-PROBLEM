
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
public class Recursion3AndHackerrank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Hello " + fact);
    }

    public static int factorial(int n) {
        int fct = 1;
        if (n <= 1) {
            return 1;
        }
        fct = n * factorial(n - 1);

        return fct;
    }
}
