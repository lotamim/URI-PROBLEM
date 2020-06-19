
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
public class Quart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0 && y != 0.0) {
            System.out.println("Eixo Y");
        } else if (x != 0.0 && y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x > 1.0 && y < 0.0) {
            System.out.println("Q4");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
//        if (X == 0.0 && Y == 0.0) {
//            System.out.print("Origem\n");
//        } 
////        else if (X == 0.0 && Y != 0.0) {
////            System.out.print("Eixo Y\n");
////        } 
////        else if (Y == 0.0 && X != 0.0) {
////            System.out.print("Eixo X\n");
////        } 
//        else if (X > 0.0 && Y > 0.0) {
//            System.out.print("Q1\n");
//        } 
//        else if (X < 0.0 && Y < 0.0) {
//            System.out.print("Q3\n");
//        } 
//        else if (X < 0.0 && Y > 0.0) {
//            System.out.print("Q2\n");
//        } 
//        else {
//            System.out.print("Q4\n");
//        }
    }
}
