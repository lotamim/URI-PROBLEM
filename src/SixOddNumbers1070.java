
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
public class SixOddNumbers1070 {

    public static void main(String[] args) {
        int X;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        for (int i = X; i < (X + (6 * 2)); i += 2) {
            int j = i;
            if (i % 2 == 0) {
                j = i + 1;
                System.out.printf("%d\n", j);
            } else {
                System.out.printf("%d\n", j);
            }
        }

    }

}
