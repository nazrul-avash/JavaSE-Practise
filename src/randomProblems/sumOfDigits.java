/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline;

/**
 *
 * @author nazrul
 */
public class sumOfDigits {
    public static int sumOfDigits(int num){
    int sum=0;
    while(num>=1){
    sum=sum+(num%10);
    num=num/10;
    }
    return sum;
    }
    public static void main(String[] args) {
        int s=14568;
        System.out.println(sumOfDigits(s));
        
    }
    
}
