
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamin
 */
public class DictionariesandMaps {

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
                String k = entry.getKey();
                int v = entry.getValue();
                if (k.equals(s)) {
                    System.out.println(k + "=" + v);
                } else {
                    System.out.println("Not found");
                }

            }

        }

    }

}
