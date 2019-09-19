/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;

/**
 *
 * @author nazrul
 */
public class IsThereThisFile {
    public static void main(String[] args) {
        File fl = new File("D:\\","psd");
        System.out.println(fl.exists());
        File[] roots = fl.listRoots();
        for (File root : roots) {
            System.out.println(root);
        }
   
        
    }
}
