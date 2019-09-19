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
public class Q7 {
    static int x;    //variable x will be inside static block
static{
    System.out.println("Im static");
     x = 6+2+(5);//increment inside bracket
}   
    public static void main(String[] args) {
        System.out.println("I am main");
        System.out.println(x);
    }
}
