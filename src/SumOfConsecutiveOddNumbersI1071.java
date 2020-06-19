
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
public class SumOfConsecutiveOddNumbersI1071 {

    public static void main(String[] args) {
        int X = 0;
        int Y = 0;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        if (X > Y) {
        }
        int sum = 0;
        for (int i = Y + 1; i < X; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
