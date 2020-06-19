
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamin
 */
public class SequenceIJ4And1098 {

    public static void main(String[] args) {  
        List list = new LinkedList();
        double I, J;
        double Jstart = 1;
        double Jend = 3;
        for (I = 0; I <= 2; I += 0.2) {
            for (J = Jstart; J <= Jend; J += 1) {
                System.out.printf("I=%.1f J=%.1f\n", I, J);
            }
            Jstart += .2;
            Jend += .2;
        }
    }
}
