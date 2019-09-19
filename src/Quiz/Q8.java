/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author nazrul
 */
public class Q8 {

    public Q8() {
        System.out.println("Im constructor");
    }
    {
        System.out.println("i am superior by order of appearance");
    }
    
    static {
        System.out.println("I am the lord");
    }
    {
        System.out.println("I am nobody");
    }
    {
        System.out.println("I am a friend of nobody");
    }
    public static void main(String[] args) {
        
        System.out.println("inside main");
        Q8 q = new Q8();
        if(q instanceof Q8){
            System.out.println("df");
        }
            }
    
}
