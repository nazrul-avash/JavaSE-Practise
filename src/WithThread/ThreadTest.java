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
public class ThreadTest {
    public static void printSomething() throws InterruptedException{
        System.out.println("hellulujah");
//        Thread.sleep(2000);
    
    }
  public static void main(String[] args) throws InterruptedException {
//       VeryFirstThread run = new VeryFirstThread();
//       ThreadThird run2 = new ThreadThird();
       Thread td = new Thread(new VeryFirstThread());
       Thread td2 = new Thread(new VeryFirstThread());
        
        td2.start();
        td.start();
        printSomething();
        
      
        System.out.println("asdf");
        
        
        
      
    }    
}
