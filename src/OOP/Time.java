/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author nazrul
 */
public class Time {
    public static void main(String[] args) {
        Date dt = new Date();
        Date dt2 = new Date(); 
        String str =dt.toString();
        System.out.println(str);
        Calendar cd = Calendar.getInstance();
        System.out.println(cd.toString());
        long l = dt.getTime();
        System.out.println(l);
                
    }
    
}
