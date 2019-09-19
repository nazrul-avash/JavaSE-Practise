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
public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> thinkTwice = new ArrayList<>();
        thinkTwice.add("If you miss this train");
        thinkTwice.add("you'll know that I'm gone!");
        Iterator<String> itr = thinkTwice.iterator();
        System.out.print(thinkTwice.size());
        thinkTwice.add("Five Hundred miles!");
        itr.hasNext();
        itr.next();
        System.out.println(thinkTwice.size());
    }
  
}
