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
public class B extends A {
    B(){
    }
    B(String s){
       
        System.out.println("constructor of B");
    
    }
   
    int gam = 12;
    void gamble() {
         A a =new A();
        System.out.println("Boop Clap!!");
    }

    @Override
    void go() {
        
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("this is class B form of method go");
    }
    
    
}
