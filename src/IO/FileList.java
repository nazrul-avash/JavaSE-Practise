/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import Collections.arrayList;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author nazrul
 */
public class FileList {
    public static void main(String[] args) {
        File fl = new File("D:\\");
        ArrayList<File> list = new ArrayList();
        String str =null;
        File fileArray[] = fl.listFiles();
        for (int i = 0; i < fileArray.length; i++) {
            list.add(fileArray[i]);
            if(fileArray[i].getName().equals("java")){
                str = fileArray[i].getAbsolutePath();
            }
        }
        System.out.println(fileArray.length);
        System.out.println(str);
        
    }
    
}
