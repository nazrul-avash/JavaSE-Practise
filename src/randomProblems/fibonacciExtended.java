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
public class fibonacciExtended {
public static int fibonacci(int nums){
int numOne=0,numTwo=1,res=0;
for(int i=1;i<nums;i++){
    res=numOne+numTwo;
    System.out.println(res+" \t");
    numOne=numTwo;
    numTwo=res;
}
return res;
}    
    public static void main(String[] args) {
        int i=10;
        i=fibonacci(i);
        System.out.println(i);
    }
}
