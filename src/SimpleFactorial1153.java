
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
public class SimpleFactorial1153 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int fact = 1;
        for (int i = N; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
