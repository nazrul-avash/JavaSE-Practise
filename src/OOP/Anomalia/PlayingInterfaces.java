/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anomalia;

/**
 *
 * @author Nos
 */
public class PlayingInterfaces {
    public static void main(String[] args) {
        Android and = new Android();
        Humanable human = new Android();
        Humanable human2 = new Cyborg();
//        System.out.println(human.getClass());
//        System.out.println(and.getClass());
//        System.out.println(human.SciName);
        System.out.println(human2.getClass());
        System.out.println(and.getClass());
        System.out.println(human2.SciName);
        System.out.println(human2.countChromosom());
//        System.out.println(human2.bathe());
        
                
    }
}
