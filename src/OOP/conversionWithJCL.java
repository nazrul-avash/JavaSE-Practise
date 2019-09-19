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
public class conversionWithJCL {
    public static void main(String[] args) {
//        int number = 2;
//        String str;
//        if(number<0){
//            System.out.println("s");
//            str = Integer.toBinaryString(number);
//            System.out.println("Binary:"+str);
//            System.out.println("decimal:"+(int)Long.parseLong(str,2));
//            
//        
//        }
//        else{
//        str = Integer.toBinaryString(number);
//        System.out.println("Binary:"+str);
//        System.out.println("Decimal:"+Integer.parseInt(str,2));
//        }
        String str = Integer.toBinaryString(-10);
        System.out.println("Binary:"+str);
        System.out.println("Decimal:"+(int)Long.parseLong(str,2));
        
      
    }
    
}
