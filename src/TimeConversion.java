
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamin
 */
public class TimeConversion {

    public static void main(String[] args) throws ParseException {
        String s = "12:00:00AM";
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm:ssa");
//        String result = LocalTime.parse(s, fmt).toString();
//        System.out.println(result);
        String _24hourFormat = "";
        String[] time = s.split(":");

        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0, 2);
        String dayEve = time[2].substring(2, 4);

        if (dayEve.equals("AM")) {
            _24hourFormat = ((hours.equals("12") ? "00" : hours) + ":" + minutes + ":" + seconds);
        } else {
            _24hourFormat = ((hours.equals("12") ? hours : (Integer.parseInt(hours) + 12)) + ":" + minutes + ":" + seconds);
        }
         System.out.println("dd " + _24hourFormat);
    }
}
