
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamin
 */
public class MaxNumber {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int n = array.length;
//        int[] revList = new int[n];
//        for (int c = 0; c < n - 1; c++) {
//            revList[n - 1] = revList[c];
//            n--;
//        }
//        for (int k = 0; k < n; k++) {
//            System.out.println(revList[k]);
//        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        reverse(array, n);
        return_arry(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    //    static void reverse(int[] array, int n) {
    //
    //        int[] revArray = new int[n];
    //        int j = n;
    //
    //        for (int c = 0; c < n; c++) {
    //            revArray[j - 1] = array[c];
    //            j--;
    //        }
    //
    //        for (int k = 0; k < n; k++) {
    //            System.out.println(revArray[k]);
    //        }
    //    }
    //    static void reverse(Integer a[]) {
    //        Collections.reverse(Arrays.asList(a));
    //        System.out.println(Arrays.asList(a));
    //    }

    public static int[] return_arry(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 4;
            break;
        }
        return arr;
    }
}
