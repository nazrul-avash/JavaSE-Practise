/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author nazrul
 */
public class finallyIsTheOnlyTruth {
    public static int sum(int a,int b){
        try {
            return a+b;
        } catch (Exception e) {
            a = 5;
            b = 6;
            return a+b;
        }
    }
    public static void main(String[] args) {
        int a =1,b = 3;
        System.out.println(sum(a,b));
    }
    
}
