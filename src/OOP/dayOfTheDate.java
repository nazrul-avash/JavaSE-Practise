/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author nazrul
 */
public class dayOfTheDate {
    public static void main(String[] args) throws ParseException {
        String date = "26/1/1950";
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = sf.parse(date);
        sf.applyPattern("EEEE yyyy");
        String str = sf.format(dt);
        System.out.println(str);
         
    }
}
