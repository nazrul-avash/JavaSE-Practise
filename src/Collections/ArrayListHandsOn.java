/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author nazrul
 */
public class ArrayListHandsOn {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
//        System.out.println(al.size());
        al.add("how");
        al.add("are");
        al.add("you?");
//        System.out.println(al.size());
//        System.out.println(al.contains("how"));
//        System.out.println(al.get(2));
//        System.out.println(al.isEmpty());
//        System.out.println(al.subList(0, 1));
//    List to array conversion    
      String []array = new String[al.size()];
      array = al.toArray(array);
        for (String counter : array) {
            System.out.println(counter);
        }
        Iterator<String> it = al.iterator();
//        it.remove();
//        al.add(""); concurrentModificationException will happen cuz of adding new element after declaring iterator object
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
