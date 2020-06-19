
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
public class ColumninArray1182 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        char T = sc.next().charAt(0);
        float[][] M = new float[3][3];
        float sum = 0;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                M[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf(M[r][c] + " ");
                if (L == c) {
                    sum += M[r][c];
                }
            }
            System.out.println("");
        }
        if (T == 'S') {
            System.out.printf("%.2f\n", sum);
        }
        if (T == 'M') {
            System.out.printf("%.2f\n", sum / 12.0);
        }
    }
}


// double a=0.0, M[12][12];
//    char T[2];
//    int C,x,y;
//    scanf("%d", &C);
//    scanf("%s", &T);
//    for(x=0;x<=11;x++)
//    {
//        for(y=0; y<=11; y++)
//        {
//        scanf("%lf", &M[x][y]);
//        if(y==C)
//            a+=M[x][y];
//        }
//    }
//    if(T[0]=='S')
//        printf("%.1lf\n",a);
//    else if(T[0]=='M')
//    {
//        a=a/12.0;
//        printf("%.1lf\n",a);
//    }
//    return 0;
