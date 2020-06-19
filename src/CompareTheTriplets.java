
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamin
 */
public class CompareTheTriplets {

    public static void main(String[] args) {
//        int[] a = {5, 6, 7};
//        int[] b = {3, 6, 10};
        int aCount = 0;
        int bCount = 0;
        List<Integer> list = new ArrayList();

        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                if (list.size() != 0) {
                    aCount = aCount + list.get(0);
                } else {
                    aCount++;
                }
            }
            if (a.get(i) < b.get(i)) {
                if (list.size() != 0) {
                    bCount = bCount + list.get(1);
                } else {
                    bCount++;
                }

            }
        }
        list.add(aCount);
        list.add(bCount);
        System.out.println(list);
    }
}
