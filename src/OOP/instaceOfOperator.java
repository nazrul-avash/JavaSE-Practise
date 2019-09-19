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
public class instaceOfOperator {
    public static void main(String[] args) {
        encapsulation in=new encapsulation();
        Double num=10.1;
        
        boolean result= in instanceof encapsulation;
        System.out.println(result);
        System.out.println(num instanceof Double );
    }
    
}
