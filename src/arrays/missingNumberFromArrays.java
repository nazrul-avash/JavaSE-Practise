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
public class missingNumberFromArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        
   }
        int missingNumber=(9*10)/2-sum;
        System.out.println(missingNumber);
    }
    
}
