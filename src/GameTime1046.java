
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
public class GameTime1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int duration = end - start;
        if (duration < 0) {
            duration = 24 + (end - start);
        }
        if (start == end) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        }
    }
}
