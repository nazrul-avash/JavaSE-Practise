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
public class MainThread {
    public static boolean isMain(){
        System.out.println(Thread.currentThread().getName());
        System.out.print(Thread.currentThread().getId());
        return Thread.currentThread().getId()==1;
    }
    public static void main(String[] args) {
//        String s = Thread.currentThread().getName();
//        System.out.println(s);
//        System.out.println(Thread.currentThread().getId());
//        System.out.println(isMain());
        AnotherClass.isMainThread();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                System.out.println(isMain());
        AnotherClass.isMainThread();
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        },"love").start();
    }
    
}
