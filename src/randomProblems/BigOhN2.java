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
public class BigOhN2 {
    public static void main(String[] args) {
        int n=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                
                System.out.print(" " +(n));
                n++;             
             }
            System.out.println("   ");
        }
    }
    
}
