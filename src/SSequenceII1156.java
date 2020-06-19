/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class SSequenceII1156 {

    public static void main(String[] args) {
        float S = 0;

        float a, b = 1, c;
        for (a = 1; a <= 39; a += 2) {
            c = a / b;
            S += c;
            b *= 2;
        }
        System.out.printf("%.2f\n", S);
    }

}
