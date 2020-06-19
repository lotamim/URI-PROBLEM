
import com.sun.org.apache.xerces.internal.xs.PSVIProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamin
 */
public class D2DArrayPractice {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 0, 0}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("a[i][i]=%d", a[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");
        }
    }

}
