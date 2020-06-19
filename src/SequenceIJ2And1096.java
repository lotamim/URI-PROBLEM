/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamin
 */
public class SequenceIJ2And1096 {
    public static void main(String[] args) {
        //        int i = 1;
//        int j = 1;
//        while (true) {
//            if (i < 10) {
//                for (j = 7; j >= 5 && i <= 9; j -= 1) {
//                    System.out.println("I=" + i + " " + "J=" + j);
//                }
//                i = i * 3;
//            } else {
//                break;
//            }
//        }

        int I, J;
//        int Jstart = 7;
//        int Jend = 5;
        for (I = 1; I <= 9; I = I + 2) {
            for (J = 7; J >= 5; J--) {
                System.out.printf("I=%d J=%d\n", I, J);
            }
        }
    }
}
