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
public class VeryFirstThread implements Runnable {
    @Override
    public void run(){
        go();
    }
    public void go(){
        System.out.println("this is running");
    }
  
}
