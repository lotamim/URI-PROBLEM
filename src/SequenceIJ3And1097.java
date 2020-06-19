/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamin
 */
public class SequenceIJ3And1097 {

    public static void main(String[] args) {
        int I, J;
        int Jstart = 7;
        int Jend = 5;
        for (I = 1; I <= 9; I = I + 2) {
            for (J = Jstart; J >= Jend; J--) {
                System.out.printf("I=%d J=%d\n", I, J);
            }
            Jstart += 2;
            Jend += 2;
        }

    }
}
