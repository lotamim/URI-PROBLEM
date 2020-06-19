
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
public class Average1040 {

    public static void main(String[] args) {
        float N1, N2, N3, N4;
        float average;
        Scanner sc = new Scanner(System.in);
        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();
        average = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        //if()
        
        if (average >= 7.0) {
            System.out.printf("Media: %.lf\n",average);
            System.out.print("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        }
    }

}
