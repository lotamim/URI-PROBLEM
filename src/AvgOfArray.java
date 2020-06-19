
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
public class AvgOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            sum += i;
        }
        System.out.println(sum);
        avg = sum / (a.length);
        System.out.println("avg " + avg);
//        System.out.println(sum);
    }
}
