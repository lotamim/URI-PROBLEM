
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
public class Experiments1094 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        String[] in = new String[N];
        int count = 0;
        int amountC = 0;
        int amountR = 0;
        int amountS = 0;
        float total = 0;
        for (int i = 0; i < N; i++) {
            in[i] = sc.nextInt() + " " + sc.next();
        }

        for (int i = 0; i < in.length; i++) {
            if (in[i].endsWith("C")) {
                String[] strAmount = in[i].split(" ");
                amountC += Integer.parseInt(strAmount[0]);
            }
            if (in[i].endsWith("R")) {
                String[] strAmount = in[i].split(" ");
                amountR += Integer.parseInt(strAmount[0]);
            }
            if (in[i].endsWith("S")) {
                String[] strAmount = in[i].split(" ");
                amountS += Integer.parseInt(strAmount[0]);
            }
        }

        total = amountC + amountR + amountS;
        float amountCpercentage = (amountC * 100) / total;
        float amountRpercentage = (amountR * 100) / total;
        float amountSpercentage = (amountS * 100) / total;

        System.out.printf("Total: %d cobaias\n", (int) total);
        System.out.printf("Total de coelhos: %d\n", amountC);
        System.out.printf("Total de ratos: %d\n", amountR);
        System.out.printf("Total de sapos: %d\n", amountS);

        System.out.printf("Percentual de coelhos: %.2f %%\n", amountCpercentage);
        System.out.printf("Percentual de ratos: %.2f %%\n", amountRpercentage);
        System.out.printf("Percentual de sapos: %.2f %%\n", amountSpercentage);

    }
}
