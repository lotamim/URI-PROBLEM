
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
public class FixedPassword1114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int password = sc.nextInt();
            if (password == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
            System.out.println("Senha Inválida");

        }
    }
    
//    int a;
//    while(1)
//    {
//        scanf("%d",&a);
//        if(a==2002)
//        {
//            printf("Acesso Permitido\n");
//            break;
//        }
//        else
//        {
//            printf("Senha Invalida\n");
//        }
//    }
}
