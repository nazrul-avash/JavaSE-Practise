/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WithThread;

/**
 *
 * @author nazrul
 */
public class JoinTest {
    public static void main(String[] args) {
        PlayWithJoin playOne = new PlayWithJoin();
        PlayWithJoin playTwo = new PlayWithJoin();
        Thread one = new  Thread(playOne,"ONE");
        Thread two = new Thread(playOne, "TWO");
        
        one.start();
        try {
            one.join(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        two.start();
        System.out.println("This is "+Thread.currentThread().getName());
    }
    
}
