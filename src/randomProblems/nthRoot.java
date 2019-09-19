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
public class nthRoot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=25;
        int nth=in.nextInt();
  
        double result=(double)1/nth;
        System.out.println(result);
        System.out.println(""+Math.pow(number,result));
    }
    
}
