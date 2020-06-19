
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
public class HighestandPosition1080 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];

        int max = a[0];
        int position = 0;

        for (int i = 0; i < 100; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                position = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(position);
        
    }
}
