/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nazrul
 */
public class StringSorting {
    public static void main(String[] args) {
         ArrayList<BigInteger> array = new ArrayList<>();
        String [] str = {"65","8","789"};
//        BigInteger biggie = new BigInteger();
        
        for (int i = 0; i < str.length; i++) {
             array.add(new BigInteger(str[i]));
//            System.out.println(array.get(i));
        }
       Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
             System.out.println(array.get(i));
        }
        
    }
    }
    

