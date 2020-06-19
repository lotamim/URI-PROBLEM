
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
public class EasyFibonacci1151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int F1 = 0;
        int F2 = 1;
        int Fn = 0;
//        System.out.printf("%d %d ", F1, F2);
        while (i < N) {
            System.out.printf("%d ", F1);
            Fn = F1 + F2;
            F1 = F2;
            F2 = Fn;
            i++;
        }
        System.out.printf("%d\n", F1);
    }
}
