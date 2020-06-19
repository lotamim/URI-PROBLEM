
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
public class Multiplesof13URI1132 {

    public static void main(String[] args) {
        int X = 0;
        int Y = 0;

        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        int sum = 0;

        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }

        for (int i = X; i <= Y; i++) {
            if (i % 13 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        
        
    }
}
