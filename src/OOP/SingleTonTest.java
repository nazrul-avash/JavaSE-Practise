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
public class SingleTonTest {
    public static void main(String[] args) {
        SingelTon a = SingelTon.getSingelInstance();
        SingelTon b = SingelTon.getSingelInstance();
        System.out.println(a.counter(5));
        System.out.println(b.counter(5));
        b.counter(4);
}
}