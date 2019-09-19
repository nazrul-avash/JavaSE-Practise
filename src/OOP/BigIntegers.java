/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.math.BigInteger;

/**
 *
 * @author nazrul
 */
public class BigIntegers {
    public static void main(String[] args) {
        String [] str = {"4564654","867651613215465","8941654"};
        int i =0;
        
        for (int j = 0; j < str.length; j++) {
            BigInteger big = new BigInteger(str[i]);
            if(big.compareTo(new BigInteger("999999999999"))==-1){
                str[j]= big.add(new BigInteger("1")).toString();
            }
            i++;
        }
        for (String str1 : str) {
            System.out.println(str1);
        }
    }
    
}
