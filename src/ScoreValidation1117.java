
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
public class ScoreValidation1117 {

    public static void main(String[] args) {
        float s1;
        Scanner sc = new Scanner(System.in);
        float avg = 0;
        float sum = 0;
        int count = 0;
        while (true) {
            if (count == 2) {
                break;
            }
            s1 = sc.nextFloat();
            if (s1 >= 0 && s1 <= 10) {
                count++;
                sum += s1;
            } else {
                System.out.println("nota invalida");
            }

        }
        System.out.printf("media = %.2f\n", sum / 2);

    }
}
