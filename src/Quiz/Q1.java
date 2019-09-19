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
public class Q1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-5);
        array.add(05);
        array.add(002+1);
        Iterator<Integer> itr = array.iterator();
        Integer num = itr.next();
        System.out.println(num);
    }
    
}
