
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
public class Staircase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        for (int i = 1; i <= n; i++) {

            for (int c = 1; c <= space; c++) {
                System.out.printf(" ");
            }
            space--;

            for (int j = 1; j <= i; j++) {

                System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }

}
