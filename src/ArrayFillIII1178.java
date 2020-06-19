
import java.text.DecimalFormat;
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
public class ArrayFillIII1178 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double X = Double.parseDouble(df.format(sc.nextDouble()));
        double[] N = new double[100];
        for (int i = 0; i < 100; i++) {
            double n = X;
            if (i == 0) {
                N[i] = X;
            } else {
                n = N[i - 1];
                N[i] = n / 2;
            }
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N" + "[" + i + "] = " + df.format(N[i]));
        }

    }

}
