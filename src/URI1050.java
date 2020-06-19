
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
public class URI1050 {

    /*
    61- Brasilia
    71-Salvador
    11-Sao Paulo
    21-Rio de Janeiro
    32-Juiz de Fora
    19-Campinas
    27-Vitoria
    31-Belo Horizonte
     */
    public static void main(String[] args) {
        int Number;
        Scanner sc = new Scanner(System.in);
        Number = sc.nextInt();
        if (Number == 61) {
            System.out.print("Brasilia\n");
        } else if (Number == 71) {
            System.out.print("Salvador\n");
        } else if (Number == 11) {
            System.out.print("Sao Paulo\n");
        } else if (Number == 21) {
            System.out.print("Rio de Janeiro\n");
        } else if (Number == 32) {
            System.out.print("Juiz de Fora\n");
        } else if (Number == 19) {
            System.out.print("Campinas\n");
        } else if (Number == 27) {
            System.out.print("Vitoria\n");
        } else if (Number == 31) {
            System.out.print("Belo Horizonte\n");
        } else {
            System.out.print("DDD nao cadastrado\n");
        }

    }
}
