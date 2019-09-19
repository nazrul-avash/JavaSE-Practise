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
public class distinctValues {
    public static int[] distinctValues(int[] nums){
    int pos=0;
    boolean b=true;
        int arr[]=new int[nums.length];
        
    for(int i=0;i<nums.length;i++){

    for(int j=0;j<arr.length;j++){
//    System.out.println(nums[i]);
        if(arr[j]==nums[i]){
    System.out.println(arr[j]);    
 b=false;


    }
    
    }
    if(b==true){
        
    arr[pos++]=nums[i];
    }
    else 
        b=true;
    }
    return arr;
    }
    public static void main(String[] args) {

        int array[]={5,2,7,2,4,7,8,2,3,1,5};
        System.out.println(Arrays.toString(distinctValues(array)));       
    }
}
