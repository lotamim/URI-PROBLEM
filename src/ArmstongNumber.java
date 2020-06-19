/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamin
 */
public class ArmstongNumber {

    public static void main(String[] args) {
        int n = 153;
        int tmp = n;
        int sum = 0, r = 0;
//        while (n != 0) {
//            r = n % 10;
//            sum += r * r * r;
//            System.out.println(n);
//            n = n / 10;
//        }
//        if (tmp == sum) {
//            System.out.println("This Armstong ");
//        } else {
//            System.out.println("This Armstong ");
//        }
//        System.out.println(sum);

//        while (n != 0) {
//            r = r*10 + n % 10;
//            n = n / 10;
//        }
//        System.out.println(r);
        int h = 10, l = 1;

        while (l < h) {
            int flag = 0;
            for (int i = 2; i < l; i++) {
                if (l % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(l);
            }
            l++;
        }
    }
}
