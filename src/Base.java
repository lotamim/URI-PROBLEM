
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 674643876 [B@12a3a380
 *
 * @author Mehedi Hasan Tamin
 */
public class Base {

    public static void main(String[] args) {
        String str = "tamim";
//        Random random = new Random();
//        System.out.println(random.nextInt());

        BaseMain baseMain = new BaseMain();
//        System.out.println(baseMain.display(str));
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$@%";
        System.out.println("Length = " + SALTCHARS.length());
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextDouble()* SALTCHARS.length());
            System.out.println(index);
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        System.out.println(saltStr);

        //return saltStr;
//        SecureRandom secureRandom = new SecureRandom();
//        byte[] token = new byte[10];
//        secureRandom.nextBytes(token);
//        System.out.println(token);
//        System.out.println(Base64.getUrlEncoder().withoutPadding().encodeToString(token));
    }
}

class BaseMain {

    public String display(String str) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encodeStr = encoder.encodeToString(str.getBytes());
        return encodeStr;
    }
}
