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
public class equlalityOfArrays {
    public static void main(String[] args) {
        int[] arr1={5,6};
        int [] arr2={5,6};
        String s=null;
        if(arr1.length==arr2.length){
        for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            s="not equal";
            break;
        }
        else
            s="equal";
        }
        
        }
        else
            s="not equal";
        System.out.println(s);
    }
   
}
