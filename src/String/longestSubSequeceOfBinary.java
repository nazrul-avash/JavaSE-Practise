/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author nazrul
 */
public class longestSubSequeceOfBinary {
    public static void main(String[] args) {
        String str = "11111";
        int x =  (int)Long.parseLong(str,2);
        int count  = 0,longest = 0;
//        System.out.println(x);
        while(x !=0){
            if(x%2 == 1){
                count++;
            }
            if(x%2 == 0){
                if(longest < count){
                    longest = count;
                    count =0;
                }
            }
            x/=2;
            if(x ==0){
                longest = count;
            }
        
        }
        System.out.println(longest);
        
    }
    
}
