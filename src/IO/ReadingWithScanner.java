/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nazrul
 */
public class ReadingWithScanner {
    public static void main(String[] args) throws IOException  {
        File fl = new File("src\\files\\again.txt");
//        System.out.println(fl.exists());
        Scanner scan = new Scanner(fl);
        String str = "";
        while(scan.hasNextLine()){
            str =str+ ""+scan.nextInt();
        }
        System.out.println(str);
    }
    
         
}
