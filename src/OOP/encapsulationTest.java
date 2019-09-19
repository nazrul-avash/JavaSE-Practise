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
public class encapsulationTest {
    public static void main(String[] args) {
        encapsulation encap=new encapsulation();
        encap.setName("Kenue Reeves");
        encap.setLocation("Golden gate bridge");
        encap.setAge(45);
        System.out.println("name"+" "+encap.getName()+" \n"+"location"+" "+encap.getLocation()+" \n"+"age"+" "+encap.getAge());
    }
}
