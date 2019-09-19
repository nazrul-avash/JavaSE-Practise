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
public class arrayAssignment {
int [] arr=new int[5];
int [] arr2={6,9,7};
    public static void main(String[] args) {
        int [] arr=new int[5];
        int [] arr2={6,9,7};
        arr= arr2;
        System.out.println(Arrays.toString(arr));
    }
}
