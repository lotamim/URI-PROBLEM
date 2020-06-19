
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
public class ArraySum {

    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            a[i] = n1;
        }

        int sum = 0;
        for (int k = 0; k < a.length; k++) {
            sum += a[k];
        }
        System.out.println(sum);
    }
    
    

}
