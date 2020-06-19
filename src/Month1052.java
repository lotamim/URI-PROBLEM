
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
public class Month1052 {

    public static void main(String[] args) {
//        String[] A = {"January", "February", "March", "April", "May", "June", "July", "August", "Septembar", "Octobar", "Novembar", "Decembar"};
//        Scanner sc = new Scanner(System.in);
//        int NUM = sc.nextInt();
//        for (int i = 0; i < A.length; i++) {
//            if (NUM < 12) {
//                if (A[i] == A[NUM]) {
//                    System.out.printf("%s\n", A[NUM - 1]);
//                }
//            }
//
//        }
//        if (NUM == 12) {
//            System.out.printf("Decembar\n");
//        }

        Scanner sc = new Scanner(System.in);
        int NUM = sc.nextInt();
        switch (NUM) {
            case 1:
                System.out.printf("January\n");
                break;
            case 2:
                System.out.printf("February\n");
                break;
            case 3:
                System.out.printf("March\n");
                break;
            case 4:
                System.out.printf("April\n");
                break;
            case 5:
                System.out.printf("May\n");
                break;
            case 6:
                System.out.printf("June\n");
                break;
            case 7:
                System.out.printf("July\n");
                break;
            case 8:
                System.out.printf("August\n");
                break;
            case 9:
                System.out.printf("Septembar\n");
                break;
            case 10:
                System.out.printf("Octobar\n");
                break;
            case 11:
                System.out.printf("Novembar\n");
                break;
            case 12:
                System.out.printf("Decembar\n");
                break;
            default:
                break;
        }
    }
}
