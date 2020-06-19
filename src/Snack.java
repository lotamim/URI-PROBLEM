
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
public class Snack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        String price = "";
        switch (X) {
            case 1:
                System.out.println("Total: R$ " + String.format("%.2f", Y * 4.0));
                break;
            case 2:
                System.out.println("Total: R$ " + String.format("%.2f", Y * 4.5));
                break;
            case 3:
                System.out.println("Total: R$ " + String.format("%.2f", Y * 5.00));
                break;
            case 4:
                System.out.println("Total: R$ " + String.format("%.2f", Y * 2.00));
                break;
            case 5:
                System.out.println("Total: R$ " + String.format("%.2f", Y * 1.5));
                break;
            default:
                System.out.println(" ");
        }

    }
}
