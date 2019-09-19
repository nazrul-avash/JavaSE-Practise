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
public class insertionSortUsingBigInteger {
    public static void main(String[] args) {
        String array[] = {"6","68","89","0","2"};
        for (int i = 1; i < array.length; i++) {
            BigInteger biggie = new BigInteger(array[i]);
            int j =i-1;
            
            while(j>=0 && (new BigInteger(array[j]).compareTo(biggie)==1)){
                
                array[j+1] = array[j];
                j--;
            
            }
            array[j+1] = biggie.toString();
           
        }
           for (String array1 : array) {
            System.out.print(array1+" ");
        }
              System.out.println("");
      
    }
    
}
