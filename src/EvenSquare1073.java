
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
public class EvenSquare1073 {

    public static void main(String[] args) {
        int X;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        for (int i = 1; i <= X; i++) {
            int even;
            if (i % 2 == 0) {
                even = i;
                System.out.println(even + "^" + 2 + " = " + even * even);
            }
        }
    }
}
