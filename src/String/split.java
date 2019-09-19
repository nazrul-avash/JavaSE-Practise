/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author nazrul
 */
public class split {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        String str[]=line.trim().split("\\s+");
      for(int i=0;i<str.length;i++){
          System.out.println(str[i]+"a");
      }
       
    }
}
