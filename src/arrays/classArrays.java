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
public class classArrays {
    public static void main(String[] args) {
        int[] arr={2,9,45,9,6,6,6,8,3,8,756,74};
        int pos=0;
        int[] nums=new int[arr.length];
        Arrays.sort(arr);
        nums[pos++]=arr[0];
        
        for(int i=1;i<arr.length;i++){
        if(arr[i]!=arr[i-1]){
        nums[pos++]=arr[i];
        
        }
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
