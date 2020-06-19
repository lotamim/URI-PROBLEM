
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
public class WeightedAverages1079 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        N = sc.nextInt();
        double avg = 0.0;
        double A = 0.0;
        double B = 0.0;
        for (int i = 1; i <= N; i++) {
            A = sc.nextFloat();
            B = sc.nextFloat();
            sc.close();
        }
        avg = ((A * 2) + (B * 3)) / 10;
        System.out.println("Hello " + avg);
        
        
        
//        int N;
//    float A,B,C;
//    float avg;
//    scanf("%d\n",&N);
//    for(int i=1;i<=N;i++){
//    scanf("%f%f%f\n",&A,&B,&C); 
//    avg = (A*2+B*3+C*5);
//    printf("%.1f\n",avg/10);
//    }
        
    }
}
