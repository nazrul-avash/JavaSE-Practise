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
public class longestSubSequence {
    public static void main(String[] args) {
        String str = "101110111011";
        int longest = 0,count = 0,i =0;
        
            while(i< str.length()){
                if( str.charAt(i)== '1'){
                    count++;
                    i++;
                   
                }
                else{
                    if(longest < count){
                        longest = count;
                       
                       
                    }

                   i++;
                   count =0;
                }
                if(i == str.length()){
                    if(longest < count){
                        longest = count;
                       
                       
                    }

                
                
                }
                               
            }
            
        System.out.println(longest);
    }
    
}
