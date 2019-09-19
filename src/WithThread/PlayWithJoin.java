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
public class PlayWithJoin implements Runnable{
    int i=0;
    //The reason behind using keyword synchronised 
    public  void run(){
        System.out.println(Thread.currentThread().getName());
        for (int j = 0; j < 10; j++) {
            
            try {
                 Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
        
        System.out.println(Thread.currentThread().getName()+i);
    }
    
           
}
