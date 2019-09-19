/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.tryOut;

/**
 *
 * @author Nos
 */
public class t2 {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i+j > 5)
                    break;
                System.out.print(i*j);
            }
        }
    }
    
}
