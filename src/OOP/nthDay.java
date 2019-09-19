/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nazrul
 */
public class nthDay {
    public static void main(String[] args) throws ParseException {
        String str ="40/2017";
        SimpleDateFormat sd = new SimpleDateFormat("DDD/yyyy");
        Date dt = sd.parse(str);
        sd.applyPattern("dd/MM/yyyy");
        String s = sd.format(dt);
        System.out.println(s);
    }
    
}
