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
public class ConcurrencyTest {
    public static void main(String[] args) {
        HandsOnConcurrencyIssue run = new HandsOnConcurrencyIssue();
        Thread alpha  = new Thread(run);
        Thread beta = new Thread(run);
        alpha.setName("Alpha");
        beta.setName("beta");
        alpha.start();
        beta.start();
    }

}
