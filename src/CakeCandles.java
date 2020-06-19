
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
public class CakeCandles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        long max = a[0];
        long count = 0;
        int temp;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            a[i] = input;
        }

//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if(a[i]>a[j]){
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }

        for (int k = 0; k < a.length-1; k++) {
            if (max <= a[k]) {
                max = a[k];
                count++;
            }
        }

        System.out.println(count);

    }
}
