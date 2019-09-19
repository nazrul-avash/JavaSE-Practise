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
public class onlyOnce {
    public static int onlyOnce(int [] nums){
    int counter=0;
    int res=0;
        for(int i=0;i<nums.length;i++){
    for(int j=0;j<nums.length;j++){
    if(nums[j]==nums[i])
        counter++;
    }
    if(counter==1){
    res=nums[i];
    }
    else
        counter=0;
    }
    return res;
    }
    public static void main(String[] args) {
        int arr[]={3,3,2,2,7,9,9};
        System.out.println(onlyOnce(arr));
    }
    
}
