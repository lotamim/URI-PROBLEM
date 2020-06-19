
import java.util.ArrayList;
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
public class Main {

    public static void main(String[] args) {
//        LamdaExpression lamdaExpression = (x,y)->{
//            int sum = x+y; 
//            System.out.println("x = "+x+ " y = "+y + " sum = "+ sum); ;
//        };
//        lamdaExpression.add(10,5);

//        lamdaExpression.multiply(6, 3);
//   LamdaExpression lamdaExpression =(str)->{
//          String result = "";
//          for(int i=str.length()-1;i>=0;i--){
//              result +=str.charAt(i);
//          }
//          return  result;
//        };
//   
//        System.out.println("reverse = "+lamdaExpression.reverse("Lambda"));
        List list = new ArrayList();
        list.add("Tamim");
        list.add("Lota");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        list.forEach((x) -> {
//            System.out.println(x);
//        }
//        );
    }

}
