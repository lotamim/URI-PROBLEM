
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamim
 */
public class Remaining2And1075 {

    public static void main(String[] args) {
        
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 1; i <= 10000; i++) {
            int r = i % N;
            if (r == 2) {
                System.out.println(i);
            }
        }
        
    }
}
