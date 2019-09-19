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
public class OuterClass {
    
   static class InnerClass{
        public void method(){
            System.out.println("I don't need outer class to be instatiated!but they say i can't!");
        }
               
               
    }
    public  void mainn() {
//        InnerClass in = new OuterClass().new InnerClass();
        InnerClass in = new InnerClass();
        in.method();
    }
    
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.mainn();
        
    }
}
