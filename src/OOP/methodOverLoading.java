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
public class methodOverLoading {
    public void methOne(int i, float j){
        System.out.println("int float");
    }
    
 public void methOne( float i, int j){
        System.out.println("float int");
    }
    public static void main(String[] args) {
        
        
        methodOverLoading mt=new methodOverLoading();
//   mt.methOne(10, 12);
        
    }
    
}
