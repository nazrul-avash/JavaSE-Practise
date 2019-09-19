/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author nazrul
 */
public class MyList {
    Object array[] = new Object[5];
    private int index = 0;
    public void add(Object a){
        if(index < array.length){
            array[index] = a;
            System.out.println("Item added at "+index);
            index++;
        }
    }
}

