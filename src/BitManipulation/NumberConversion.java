/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitManipulation;

/**
 *
 * @author nazrul
 */
public class NumberConversion{
    public static String decimalToBinarya(int num){
        return Integer.toBinaryString(num);
        
    }
    public static int binaryToDecimal(String bin){
//        int sum = 0;
//        for (int i = bin.length()-1,j=0; i >= 0; i--,j++) {
//            sum = sum + (Integer.parseInt(bin.substring(i, i+1))*(int)Math.pow(2,j));
//        }
//        return sum;
          return Integer.parseInt(bin, 2);
    }
    public static String decimalToOctal(int num){
    
        return Integer.toOctalString(num);
    }
    public static int octalToDecimal(String oct){
        return Integer.parseInt(oct, 8);
    }
    public static String decimalToHex(int num){
        return Integer.toHexString(num);
    }
    public static int hexToDecimal(String hex){
        return Integer.parseInt(hex, 16);
    }
    
}
