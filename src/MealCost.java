
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
public class MealCost {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        int totalCost = 0;

//        double tip = (meal_cost * (tip_percent / 100));
        double tip = (tip_percent * meal_cost) / 100;
        double tax = (tax_percent * meal_cost) / 100;
        totalCost = (int) Math.round(meal_cost + tip + tax);
        System.out.println(totalCost);

    }
}
