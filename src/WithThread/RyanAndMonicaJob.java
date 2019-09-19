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
public class RyanAndMonicaJob implements Runnable{
   private BankAccount ba = new BankAccount();
    public static void main(String[] args) {
        RyanAndMonicaJob job = new RyanAndMonicaJob();
        Thread one = new Thread(job);
        Thread two = new Thread(job);
        one.setName("Monica");
        two.setName("Ryan");
        one.start();
        two.start();
        
        
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            makeWithDrawal(100);
        
        if(ba.getBalance()<0){
            System.out.println("overdrawn");
        }
        else{
            System.out.println(ba.getBalance());
        }
        }
    }
    public synchronized  void  makeWithDrawal(int amount){
        if(ba.getBalance()>= amount){
            
            try{
            System.out.println(Thread.currentThread().getName()+ " is about to withdraw ");
            Thread.sleep(500);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" woke up");
            ba.withDraw(amount);
            System.out.println(Thread.currentThread().getName()+"  just completed withdrawal!");
            
        }
        else{
            System.out.println("Sorry not enough money for "+Thread.currentThread().getName());
        
        }
    }
    
    
}
