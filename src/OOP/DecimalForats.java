/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.text.DecimalFormat;

/**
 *
 * @author nazrul
 */
public class DecimalForats {
    public static void main(String[] args) {
        String pattern  = "";
        DecimalFormat df = new DecimalFormat(pattern);
        int number = 1677509970;
        String value = df.format(number);
        System.out.println(value);
       
        
    }
    
}
