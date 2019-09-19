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
public class isPalindrome {
    public static boolean isPalindrome(int [] nums){
        int pos=nums.length-1;
    for(int i=0;i<(nums.length/2);i++){
    if(nums[i]!=nums[pos--]){
    return false;
    }
    
    }
    return true;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,1,3};
        System.out.println(isPalindrome(arr));
    }
}
