
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
public class RestofaDivision1133 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;
        X = sc.nextInt();
        Y = sc.nextInt();

        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }

        for (int i = X + 1; i < Y; i++) {
            int r = i % 5;
            if (r == 2 || r == 3) {
                System.out.println(i);
            }
        }

    }
}
