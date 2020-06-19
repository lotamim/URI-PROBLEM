
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamin
 */
public class MainProduct {

    public static void main(String[] args) {

        List<Product> listProduct = new ArrayList<Product>();

        listProduct.add(new Product(1, "HP Laptop", 25000f));
        listProduct.add(new Product(3, "Keyboard", 300f));
        listProduct.add(new Product(2, "Dell Mouse", 150000f));
        listProduct.add(new Product(1, "ASUS", 40000f));

        Collections.sort(listProduct, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        }
        );

//        Stream<Product> filtered_data = listProduct.stream().filter(p -> p.price > 20000);  
        Stream<Product> filtered_data = listProduct
                .stream();
//                                        .filter( p-> p.price>20000);

//        filtered_data.forEach(params -> {
//            System.out.println(params.name + " " + params.price);
//        }
//        );
        Product compare = listProduct
                .stream()
                .min(Comparator.comparing((product) -> product.price))
                .get();
        System.out.println(compare.price);

        List<Double> intList = Arrays.asList(10.10, 20.67, 30.45);

        Double val = intList
                .stream()
                .max(Comparator.comparingDouble(Double::valueOf)).get();

        System.out.println(val);

        List names = Arrays.asList("Reflection", "Collection", "Stream");
        List result = (List) names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);

//        Stream<Product> filtered = listProduct
//                                   .stream()
//                                   .filter(x->x.price>300);
        List<Float> listPd = listProduct
                .stream()
                .filter(x -> x.price > 0)
                .map(mp -> mp.price)
                .collect(Collectors.toList());

        listPd.forEach(action -> System.out.println(action)
        );

    }

}
