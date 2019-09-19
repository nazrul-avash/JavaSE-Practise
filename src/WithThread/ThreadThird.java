/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WithThread;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nazrul
 */
public class ThreadThird implements Runnable{
   public void run(){
       Date dt =new Date();
       System.out.println(dt);
       Thread t = new Thread();
       try {
           t.sleep(1000);
           System.out.println(dt);
       } catch (InterruptedException ex) {
           Logger.getLogger(ThreadThird.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   
   }
   
}
