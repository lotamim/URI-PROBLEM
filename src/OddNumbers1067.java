
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
public class OddNumbers1067 {

    public static void main(String[] args) {
        int X;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        for (int i = 0; i <= X; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d\n", i);
            }
        }
    }
}
