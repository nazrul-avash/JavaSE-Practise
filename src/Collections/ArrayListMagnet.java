/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;

/**
 *
 * @author nazrul
 */
public class ArrayListMagnet {
    public static void printAl(ArrayList<String> al){
        for (String al1 : al) {
            System.out.print(al1+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        ArrayList <String>a = new ArrayList();
        a.add(0, "zero");
        a.add(1,"one");
        a.add(2, "two");
        a.add(3, "three");
        printAl(a);
        a.remove(2);
         if(a.contains("three")){
            a.add("four");
        }
        printAl(a);
       
        if(a.indexOf("four")!= 4){
            a.add("4.2");
        }
        printAl(a);
        printAl(a);
    }
    
}
