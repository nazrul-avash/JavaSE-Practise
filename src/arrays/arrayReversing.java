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
public class arrayReversing {




    public static void main(String[] args) {
        int arr[]={2,6,8};
        int arr2[]=new int[arr.length];
        int j=arr.length-1;
        for(int i: arr){
        arr2[j--]=i;
        
        }
    
        System.out.println(Arrays.toString(arr2));
    }
    
}
