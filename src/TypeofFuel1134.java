
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
public class TypeofFuel1134 {

    public static void main(String[] args) {
        int n;
        int al = 0;
        int ga = 0;
        int di = 0;

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            n = sc.nextInt();
            if (n == 1) {
                al++;
            } else if (n == 2) {
                ga++;
            } else if (n == 3) {
                di++;
            } else if (n == 4) {
                break;
            } else {
                continue;
            }
        }

        System.out.print("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", al);
        System.out.printf("Gasolina: %d\n", ga);
        System.out.printf("Diesel: %d\n", di);

    }
}
