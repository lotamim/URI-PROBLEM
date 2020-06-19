
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
public class Triangle1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float ab = a + b;
        float ac = a + c;
        float bc = b + c;

//        float perimeter = 0;
        //float area = 0;
        if (ab > c && ac > b && bc > a) {
          float  perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f \n", perimeter);
        } else {
           float area = ((a + b) * c) / 2;
           System.out.printf("Area = %.1f \n", area);
        }
        
    }
}
