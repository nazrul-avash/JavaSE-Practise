/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nos
 */
public class Q6 {
    public static void main(String[] args) {
        ArrayList<String> postRock =new ArrayList<String>();
        ArrayList<String> indieRock =new ArrayList<>();
        postRock.add("Keep meditating");
        postRock.add("and you'll know");
        postRock.add("what its power");
        List<String> lsd = postRock.subList(1, 2);
        indieRock.addAll(lsd);
        System.out.println(indieRock.get(1));
    }
    
}
