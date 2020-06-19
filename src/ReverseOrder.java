/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamin
 */
public class ReverseOrder {

    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2};
        int len = a.length;
        int[] rev = new int[len];
        System.out.println(len);
        for (int i = 0; i < a.length; i++) {
            rev[--len] = a[i];
        }

        for (int n = 0; n < rev.length; n++) {
            System.out.printf("%d ", rev[n]);
        }
    }

}
