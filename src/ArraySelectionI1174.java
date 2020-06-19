
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
public class ArraySelectionI1174 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] A = new float[100];

        for (int i = 0; i < 100; i++) {
            A[i] = sc.nextFloat();;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                System.out.println("A[" + i + "] = " + A[i]);
            }

        }
        
    }
}
