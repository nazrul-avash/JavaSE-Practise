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
public class Q9 {
    public static void main(String[] args) {
        int angel = 32;
        while(angel < 100){
            if((angel & -angel) == angel){
                System.out.println(angel);
                
            }
            angel++;
        }
    }
    
}
