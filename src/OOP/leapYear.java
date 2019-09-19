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
public class leapYear {
    public static void main(String[] args) {
        int count = 0; 
        for (int i = 1752; i <= 2017; i+=4) {
            if((i%4==0 && i%400==0 && i%100==0)|| (i%4==0 && i%100!=0)){
                count++;
//                System.out.print(" "+i);
        }
    }
        System.out.println(count);
    
}
}