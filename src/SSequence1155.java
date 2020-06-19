/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamin
 */
public class SSequence1155 {

    public static void main(String[] args) {
        float S = 0;
        for (float i = 1; i <= 100; i++) {
            S += 1.0 / i;
        }
        System.out.printf("%.2f\n", S);
    }
}
