
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
public class URI1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] org = new int[3];
        int temp;
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            org[i] = a[i];
        }

        for (int b = 0; b < a.length; b++) {
            for (int c = b + 1; c < a.length; c++) {
                if (a[b] > a[c]) {
                    temp = a[b];
                    a[b] = a[c];
                    a[c] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        System.out.println();
        for (int i = 0; i < org.length; i++) {
            System.out.println(org[i]);
        }
    }
}
