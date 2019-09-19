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
public class SingelTon {
    private static SingelTon single = new SingelTon();
    int count = 0;
    private SingelTon(){
        
    }
    public static SingelTon getSingelInstance(){
        return single;
    }
    public int counter(int value){
        count = count + value;
        return count;
    }
}
