
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
public class Subsequent {

    public static void main(String[] args) {
//        String str = "tamim";

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            String odd = "";
            String even = "";
            
            String str = sc.next();

            for (int k = 0; k < str.length(); k++) {
                if (k % 2 == 0) {
                    even += str.charAt(k);
                } else {
                    odd += str.charAt(k);
                }

            }
            System.out.println(even + " " + odd);
        }
    }
}
