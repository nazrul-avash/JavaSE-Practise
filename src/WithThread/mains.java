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
public class mains {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        int i =0;
        for (;;) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }).start();
            
//            System.out.println(i++);
        }
    }
    
}
