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
public class BankAccount {
     private int balance = 100;
       public int getBalance(){
        return balance;
    }
     public void withDraw(int amount){
        balance = balance - amount;
     }
   
    
}
