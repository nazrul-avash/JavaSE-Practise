/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Lenovo
 */
public class maxValueOfArray {
    public static void main(String[] args) {
        int arr[]={4,878,54,8,54,888,8,54,87,45,324};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
        if(max<arr[i]){
        max=arr[i];
        }
        
        }
        System.out.println("largest number is:"+max);
    }

    
}
