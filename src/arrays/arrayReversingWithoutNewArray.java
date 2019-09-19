/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author nazrul
 */
public class arrayReversingWithoutNewArray {
    public static void main(String[] args) {
        int temp=0;
        int arr[]={4,5,67,9,8};
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
         j--;
        
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
