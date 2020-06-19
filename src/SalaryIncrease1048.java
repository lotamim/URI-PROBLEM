
import java.text.DecimalFormat;
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
public class SalaryIncrease1048 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        String input = df.format(sc.nextDouble());
        double new_salary = 0.0;
        double money_earned = 0.0;
        int in_percentage = 0;
        double salary = Double.parseDouble(input);
        if (salary <= 400.00) {
            in_percentage = 15;
            new_salary = salary + (salary * in_percentage) / 100;
            money_earned = (salary * in_percentage) / 100;
            System.out.printf("Novo salario: %.2f\n", new_salary);
            System.out.printf("Reajuste ganho: %.2f\n", money_earned);
            System.out.printf("Em percentual: %d %%\n", in_percentage);
        } else if (salary <= 800.00) {
            in_percentage = 12;
            new_salary = salary + (salary * in_percentage) / 100;
            money_earned = (salary * in_percentage) / 100;
            System.out.printf("Novo salario: %.2f\n", new_salary);
            System.out.printf("Reajuste ganho: %.2f\n", money_earned);
            System.out.printf("Em percentual: %d %%\n", in_percentage);
        } else if (salary <= 1200.00) {
            in_percentage = 10;
            new_salary = salary + (salary * in_percentage) / 100;
            money_earned = (salary * in_percentage) / 100;
            System.out.printf("Novo salario: %.2f\n", new_salary);
            System.out.printf("Reajuste ganho: %.2f\n", money_earned);
            System.out.printf("Em percentual: %d %%\n", in_percentage);
        } else if (salary <= 2000.00) {
            in_percentage = 7;
            new_salary = salary + (salary * in_percentage) / 100;
            money_earned = (salary * in_percentage) / 100;
            System.out.printf("Novo salario: %.2f\n", new_salary);
            System.out.printf("Reajuste ganho: %.2f\n", money_earned);
            System.out.printf("Em percentual: %d %%\n", in_percentage);
        } else {
            in_percentage = 4;
            new_salary = salary + (salary * in_percentage) / 100;
            money_earned = (salary * in_percentage) / 100;
            System.out.printf("Novo salario: %.2f\n", new_salary);
            System.out.printf("Reajuste ganho: %.2f\n", money_earned);
            System.out.printf("Em percentual: %d %%\n", in_percentage);
        }

    }

}
