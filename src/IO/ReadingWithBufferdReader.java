/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author nazrul
 */
public class ReadingWithBufferdReader {
    public static void main(String[] args) {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        try {
             String str = buff.readLine();
             File fl = new File("src\\files\\again.txt");
             System.out.println(fl.exists());
             FileWriter fw = new FileWriter(fl,true);
             fw.write(str); 
             fw.close();
        } catch (Exception e) {
        }
    }
    
}
