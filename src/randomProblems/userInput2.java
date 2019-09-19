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
public class userInput2 {
    public static void main(String[] args) {
        System.out.println("How many number your line must have?");
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        double arr[]=new double[number];
        for(int i=0;i<number;i++){
        arr[i]=in.nextDouble();
        }
        for(double i:arr){
            System.out.println(i);
        }
    }
    
}
