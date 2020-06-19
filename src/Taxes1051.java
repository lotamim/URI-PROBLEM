
import java.text.DecimalFormat;
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
public class Taxes1051 {

    public static void main(String[] args) {
        double salary;
        double tax;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        salary = Double.parseDouble(df.format(sc.nextDouble()));
//        System.out.println(salary);
        if (salary <= 2000.00) {
            System.out.printf("Isento\n");
        }
        if (salary >= 2000.01 && salary <= 3000.00) {
            tax = ((salary - 2000) * 8) / 100;
            System.out.printf("R$ %.2f\n", tax);
        }
        if (salary >= 3000.01 && salary <= 4500.00) {
            tax = (((salary - 3000) * 18) / 100) + (1000 * .08);
            System.out.printf("R$ %.2f\n", tax);
        }
        if (salary >= 4500.00) {
            tax = (((salary - 4500) * 28) / 100 + (1000 * .08 + 1500 * .18));
            System.out.printf("R$ %.2f\n", tax);
        }
    }
}
