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
public class increment {
    public static void main(String[] args) {
        int [] arr={5,1,016,20,25};

        int i=++arr[1];
        int j=arr[1]++;
        int m=arr[i++];
        System.out.println(i+""+j+""+m);
        int arr2[]=new int[3];
        System.out.println(arr2[0]);
        System.out.println(8%16);
    }
    
}
