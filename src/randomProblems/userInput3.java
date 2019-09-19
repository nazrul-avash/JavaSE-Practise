/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomProblems;

import java.util.Scanner;

/**
 *
 * @author nazrul
 */
public class userInput3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your inputs:");
        String numbers=in.nextLine();
        String arr[]=numbers.trim().split("\\s+");
        double arr2[]=new double[arr.length];
        for(int i=0;i<arr.length;i++){
        arr2[i]=Double.parseDouble(arr[i]);
        }
        for(double i:arr2){
            System.out.println(i);
        }
    }
    
}
