/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomProblems;

/**
 *
 * @author nazrul
 */
public class equalVsEq {
    public static void main(String[] args) {
        String s1= "yes";
        String s2="yes";
        String s3=new String(s1);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
    
}
