/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomProblems;

/**
 *
 * @author nazrul
 */
public class fibonacci {
    public static void fibonacci(int num){
    int numOne=0,numTwo=1,res = 0;
        System.out.println(" "+numOne+" \n"+ numTwo);
        while(res<=num){
            res=numOne+numTwo;
            System.out.print("\t "+res);
            numOne=numTwo;
            numTwo=res;
        
        
        }
    }
    public static void main(String[] args) {
        int i=10;
        fibonacci(i);
    }
}
