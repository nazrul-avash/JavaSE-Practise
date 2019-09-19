/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.tryOut;

/**
 *
 * @author nazrul
 */
public class t8 {
    public static void main(String[] args) {
        String str ="5.0";
        int y = 0;
        try{
            y = Integer.parseInt(str)%2;
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(y);
    }
    
            
}
