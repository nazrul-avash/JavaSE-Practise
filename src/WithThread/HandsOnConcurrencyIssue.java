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
public class HandsOnConcurrencyIssue implements Runnable{
   public void run(){
       int beta = 0;
       int alpha = 0;
       for (int i = 0; i < 10; i++) {
           String threadName = Thread.currentThread().getName();
           if(threadName.equals("beta")){
               beta++;
           }
           else{
               alpha++;
           }
          
       }
        System.out.println(beta+" "+alpha);
   
   }
    
}
