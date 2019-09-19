/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;

/**
 *
 * @author nazrul
 */
public class MoreWithFileClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str ="Hello File ! I gonna get you down!";
        File fl = new File("C:\\Users\\Lenovo\\Desktop\\Fone\\hello.txt");
//        System.out.println(fl.getParent());
//        System.out.println(fl.isFile());
//        FileInputStream in = new FileInputStream(fl);
//        FileReader out = new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\Fone\\hello.txt"));
        
         
//        System.out.println(fl.createNewFile());
//        FileWriter out = new FileWriter(fl);
//        out.write(str);
//        out.close();
//        fl.renameTo(new File("C:\\Users\\Lenovo\\Desktop\\Ftwo\\hello.txt"));
          
          FileReader read = new FileReader(fl);
          FileWriter copy = new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\Ftwo\\hello.txt"));
          
          copy.close();
          read.close();

}
}
