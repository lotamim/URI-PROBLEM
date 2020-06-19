
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
public class TriangleTypes1045 {

    /*
    if A ≥ B + C, write the message: NAO FORMA TRIANGULO
    if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
    if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
    if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
    if the three sides are the same size, write the message: TRIANGULO EQUILATERO
    if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

//        System.out.println("A = " + A);
//        System.out.println("B= " + B);
//        System.out.println("C =" + C);
        double temp;
        if (A < B) {
            temp = A;
            A = B;
            B = temp;
        }
        if (B < C) {
            temp = B;
            B = C;
            C = temp;
        }
        if (A < B) {
            temp = A;
            A = B;
            B = temp;
        }
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A * A == B * B + C * C) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (A * A >= B * B + C * C) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (A * A < B * B + C * C) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if ((A == B) || (B == C)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
