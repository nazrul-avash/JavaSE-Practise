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
public class t6 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i+=2) {
            for (int j = 0; j < 3; j++) {
                if(i +j > 4)
                    break;
                System.out.println(i*j);
            }
        }
    }
    
}
