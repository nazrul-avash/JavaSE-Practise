/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author nazrul
 */
public class Q11 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < "asdf".substring(0, 3).length(); i++) {
            sum = sum + ~(i);
        }
        System.out.println(sum);
    }
    
}
