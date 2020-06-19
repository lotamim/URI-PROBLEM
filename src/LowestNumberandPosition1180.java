
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
public class LowestNumberandPosition1180 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] X = new int[N];
        int min = X[0];
        int position = 0;
        if (1 < N && N < 1000) {
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
            }
        }
        for (int i = 1; i < X.length; i++) {
            if (min > X[i]) {
                min = X[i];
                position = i;
            }
        }

        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + position);
    }
}

// int a,b,c,d,e,N, p, min;
//    scanf("%d", &N);
//    int X[N];
//    for(a=0; a<N; a++)
//        scanf("%d", &X[a]);
//    min=X[0];
//    for(a=1; a<N; a++)
//    {
//        if(min>X[a])
//        {
//            min=X[a];
//            p=a;
//        }
//    }
//    printf("Menor valor: %d\nPosicao: %d\n", min, p);
//    return 0;
