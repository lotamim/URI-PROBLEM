
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
public class Interval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();

        if (input < 0 || input > 100) {
            System.out.println("Fora de intervalo");
        } else if (input <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (input <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (input <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else if (input <= 100) {
            System.out.println("Intervalo (75,100]");
        }

    }

}
