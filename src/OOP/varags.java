/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import javax.sound.sampled.AudioFileFormat;

/**
 *
 * @author nazrul
 */
public class varags {
    public static void printAnything(String ...str){
        for (String string : str) {
            System.out.println(string);
        }
    }
    public static void printSomething(int a,int ...b){
        System.out.println("this is called varags but i would say overload killer");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        
        System.out.println(args.length);
        printSomething(3);
        printAnything("afd","reoijg");
        printAnything("eirenf");
        printAnything();
    }
}
