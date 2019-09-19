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
/*An array contains n numbers ranging from 0 to n-2. There is exactly one number is repeated in
the array. You need to write a program to find that duplicate number. For example, if an array with
length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3.*/


public class duplicateNumberInArray {
    public static void main(String[] args) {
        int arr[]={0,3,1,2,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    
        }
    int duplicateNum=(4*5)/2-sum;
    
        System.out.println(arr.length-1-duplicateNum);
    }
}
