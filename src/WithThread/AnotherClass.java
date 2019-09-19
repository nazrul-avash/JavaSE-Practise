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
public class AnotherClass {
    public static void isMainThread(){
        System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getId());
    }
}
