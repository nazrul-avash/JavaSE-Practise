/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nazrul
 */
public class MovingFile {
    public static void main(String[] args) throws IOException {
        String str = "i don't know how to approach";
        String str2 ="to her";
        
        File fl  = new File("C:\\Users\\Lenovo\\Desktop\\one.txt");
        fl.renameTo(new File("C:\\Users\\Lenovo\\Desktop\\Fone\\asdf.txt"));
        System.out.println(fl.getName());
        fl.createNewFile();
        FileWriter out = new FileWriter(fl,true);
        FileReader in = new FileReader("C:\\Users\\Lenovo\\Desktop\\Fone\\hello.txt");
//        out.write(str);
//        out.append(str2);
        int i;
        while((i=in.read())!= -1){
            out.write(i);
        
        }
        out.close();
        
    }
    
}
