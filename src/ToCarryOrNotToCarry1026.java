
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
public class ToCarryOrNotToCarry1026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long x = sc.nextLong();
            long y = sc.nextLong();
//            if (a < b) {
//                int temp = a;
//                a = b;
//                b = temp;
//            }

            System.out.println((x ^ y));
        }

    }
}
