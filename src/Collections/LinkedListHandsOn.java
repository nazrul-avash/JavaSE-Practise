/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author nazrul
 */
public class LinkedListHandsOn {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
//        System.out.println(ls.size());
        ls.add("Hey");
        ls.add("you");
        ls.add("out there");
        ls.add("in the cold");
        ls.addFirst("pink");
//        System.out.println(ls.getFirst());
//        System.out.println(ls.get(0));
//        System.out.println(ls.getLast());
//        System.out.println(ls.getClass());
//        System.out.println(ls.subList(1, 2));
        System.out.println(ls.offer("floyd"));
        System.out.println(ls.getLast());
        ls.add("Hey");
        Iterator<String> it = ls.iterator();
//        ls.removeLast();
//        it.remove();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
    
}
