/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.tryOut;

/**
 *
 * @author Nos
 */
public class t3Main {
    public static void main(String[] args) {
        t3 p1 = new t3(8);
        t3 p2 = new t3(p1);
        System.out.println(p2.x);
    }
    
}
