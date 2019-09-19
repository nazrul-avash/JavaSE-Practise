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
/* This program concats two java arrays without using any library class */
public class concatArrays {
    public static void main(String[] args) {
        int arr1[]={45,8};
        int arr2[]={98,9};
        int arr3[] =new int[4];
      
        
        for(int i=0;i<arr3.length;i++){
        if(i<2)
            arr3[i]=arr1[i];
        else
        arr3[i]=arr2[i-arr1.length];
        }
    for(int i=0;i<arr3.length;i++){
        System.out.println(arr3[i]);
    }
    }
    
}
