/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Nos
 */
public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello darkness");
        array.add("my old friend");
        Iterator<String> itr = array.iterator();
        System.out.println(array.size());
        System.out.println(array.add("how do you like me now?"));
       
    }
    
}
