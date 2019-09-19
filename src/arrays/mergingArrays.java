/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author nazrul
 */
public class mergingArrays {
    public static void main(String[] args) {
        int array[] = new int[]{1,3,5,7,9};
        int array2[] = new int[]{0,2,4,6,8,10};
        int array3[] = new int[array.length+array2.length];
        int m = 0, n = 0,i=0;
        while(m < array.length && n <array2.length){
            if (array[m]< array2[n]) {
                array3[i++] = array[m++];
                
            }
            else{
                array3[i++] = array2[n++];
                
            }
        
        
        }
        while(m <array.length){
            array3[i++] = array[m++];
        }
        while(n < array2.length){
            array3[i++] = array2[n++];
        }
         
          
            
            
        
        for (int b : array3) {
            System.out.println(b);
        }
    }
}
