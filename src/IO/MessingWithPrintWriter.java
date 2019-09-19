/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author nazrul
 */
public class MessingWithPrintWriter {
    public static void main(String[] args) throws IOException{
        File fl = new File("a.txt");
        PrintWriter pt = new PrintWriter(fl);
        pt.println("afertre g");
        pt.flush();
        pt.close();
        FileWriter fw = new FileWriter(fl);
        System.out.println(fl.getAbsoluteFile());
        fw.write("sadf");
        fw.close();
        
        
    }
    
}
