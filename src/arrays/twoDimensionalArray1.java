/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author nazrul
 */
public class twoDimensionalArray1 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int array[][] = new int[3][4];
        int sum = 0;
        System.out.println(array.length);
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i+j;
            }
        }
          for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==2){
                      sum = sum + array[i][j];
                        
                }
                System.out.print(array[i][j]+" ");
            
            }
              System.out.println("");
        }
          System.out.println(sum);
    }
    
}
