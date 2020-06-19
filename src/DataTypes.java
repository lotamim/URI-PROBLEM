
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
public class DataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = 12;
        double d = 4.0;
        String s = "HackerRank ";
//        String s = " is the best place to learn and practice coding!";

        int inputInterger = sc.nextInt();
        double inputDouble = sc.nextDouble();
        sc.nextLine();
        String inputString = sc.nextLine();

        //System.out.println("Initaial int value is : " + intSum);
        String ll = "";
        if (inputInterger > 0) {
            i += inputInterger;
        }
        System.out.println(i);

        //System.out.println("Initaial double value is : " + doubleSum);
        if (inputDouble > 0) {
            d += inputDouble;
        }
        System.out.printf("%.1f \n", d);

        //System.out.println("Initaial String value is : " + con);
//        if (inputString != null) {
//           inputString =  inputString;
////            ll = s + inputString;
//        }
        System.out.println(inputString);

        sc.close();
    }

}
