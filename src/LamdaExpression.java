/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamim
 */
interface LamdaExpression{
//    void add(int x, int y);
    String reverse(String n);
     default void multiply(int x, int y){
         System.out.println("multiply = "+ x*y);
    }
   // int multiply(int x, int y);
}
