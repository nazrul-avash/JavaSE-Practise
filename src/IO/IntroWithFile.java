/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author nazrul
 */
public class IntroWithFile {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        String pathName = "src\\files\\a.txt";
//        File fl = new File("https://wordpress.org/plugins/about/readme.txt");
        File fl = new File(pathName); 
        System.out.println(fl.canExecute());
        System.out.println(fl.getCanonicalPath());
        System.out.println(fl.createNewFile());
//        fl.delete();
    }
    
}
