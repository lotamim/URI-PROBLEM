
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
public class Animal1049 {

    public static void main(String[] args) {
        String group, catagory, subCatagory;
        Scanner sc = new Scanner(System.in);
        group = sc.next();
        catagory = sc.next();
        subCatagory = sc.next();
        
        if (group.toLowerCase().equals("vertebrado") && catagory.toLowerCase().equals("mamifero") && subCatagory.toLowerCase().equals("onivoro")) {
            System.out.printf("homem\n");
        }
        if (group.toLowerCase().equals("vertebrado") && catagory.toLowerCase().equals("ave") && subCatagory.toLowerCase().equals("carnivoro")) {
            System.out.printf("aguia\n");
        }
        if (group.toLowerCase().equals("invertebrado") && catagory.toLowerCase().equals("anelideo") && subCatagory.toLowerCase().equals("onivoro")) {
            System.out.printf("minhoca\n");
        }
        if (group.toLowerCase().equals("vertebrado") && catagory.toLowerCase().equals("ave") && subCatagory.toLowerCase().equals("onivoro")) {
            System.out.printf("pomba\n");
        }

        if (group.toLowerCase().equals("vertebrado") && catagory.toLowerCase().equals("mamifero") && subCatagory.toLowerCase().equals("herbivoro")) {
            System.out.printf("vaca\n");
        }
        if (group.toLowerCase().equals("invertebrado") && catagory.toLowerCase().equals("inseto") && subCatagory.toLowerCase().equals("hematofago")) {
            System.out.printf("pulga\n");
        }
        if (group.toLowerCase().equals("invertebrado") && catagory.toLowerCase().equals("inseto") && subCatagory.toLowerCase().equals("herbivoro")) {
            System.out.print("lagarta\n");
        }
        if (group.toLowerCase().equals("invertebrado") && catagory.toLowerCase().equals("anelideo") && subCatagory.toLowerCase().equals("hematofago")) {
            System.out.printf("sunguessuga\n");
        }

    }

}
