/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author nazrul
 */
public class DecimalToBinary {
    private int decimalNumber;
    private int binaryNumber;
    private String res="";
    public DecimalToBinary(int dec){
        this.decimalNumber = dec;
    }
    public int getBinary(){
        while(decimalNumber!=0){
           
           
            res += (decimalNumber%2);
            
            decimalNumber/=2;
        }
        StringBuilder sb =new StringBuilder(res).reverse();
        return Integer.parseInt(sb.toString());
    }
   
}
