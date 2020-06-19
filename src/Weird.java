
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
public class Weird {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            if (number >= 2 && number < 5) {
                System.out.println("Not Weird");
            }
            if (number >= 6 && number <= 20) {
                System.out.println("Weird");
            }
            if (number > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
