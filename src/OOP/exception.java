/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author nazrul
 */
public class exception {
    public static void main(String[] args) throws ArithmeticException {
        int x =0;
        try{
            System.out.println(10/x);
            System.out.println("its not gonna run");
        }
//            catch(Exception ex){
//            return;
////            System.out.println("exception occured\n"+ex.toString());
//        
//        }
          finally{
                System.out.println("its the only truth");
                }
        System.out.println("It should run after catch block\n"+x);
      
    }
    
}
