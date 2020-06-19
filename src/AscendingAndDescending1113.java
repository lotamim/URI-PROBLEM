
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
public class AscendingAndDescending1113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;
        while (true) {

            X = sc.nextInt();
            Y = sc.nextInt();
            if (X > Y) {
                System.out.println("Decrescente");
            } else if (X == Y) {
                break;
            } else {
                System.out.println("Crescente");
            }

        }
    }
}
