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
public class AllDriveLetters {
    public static void main(String[] args) {
        File[] roots = new File("C:\\").listRoots();
        for (File root : roots) {
            System.out.print(root.getAbsolutePath());
            System.out.println(" "+root.getUsableSpace()/(1024*1024*1024));
          
        }
        
    }
}
