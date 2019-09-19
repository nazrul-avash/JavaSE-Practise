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
public class t1 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            if((i>2) && (++x > 2)){
                x += 7;
            }
        }
        System.out.println(x);
    }
    
}
