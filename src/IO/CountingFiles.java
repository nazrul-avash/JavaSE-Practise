/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nazrul
 */
public class CountingFiles {
    public static String searchFile(final String fileName,File fl,ArrayList<File> al){
         File[] fileArray = fl.listFiles();
         if(fl.listFiles()!=null){
        
        for (int i = 0; i < fileArray.length; i++) {
            if(fileArray[i].isFile()){
               al.add(fileArray[i]);
            }
            else{
                if(fileArray[i].isDirectory()){
                    searchFile(fileName,fileArray[i].getAbsoluteFile(),al);
                }
            }
        }
         }
//         System.out.println(al.size());
        for (File file : al) {
            if(file.getName().toLowerCase().contains(fileName.toLowerCase())){
                return file.getAbsolutePath();
            }
            
        }
         
        return "sorrry ,No such file";
    }
    public static int countAllFiles(File fl,ArrayList<File> listOfFiles){
       
        
 
        File[] fileArray = fl.listFiles();
        
        
        for (int i = 0; i < fileArray.length; i++) {
            if(fileArray[i].isFile()){
                listOfFiles.add(fileArray[i]);
            }
            else{
                if(fileArray[i].isDirectory()){
                    countAllFiles(fileArray[i].getAbsoluteFile(), listOfFiles);
                }
            }
        }
    return listOfFiles.size();
    }
    //Count the number of files and folder in any directory
    public static int countFiles(File fl){
        if(fl.exists()){
            int counter = 0;
            ArrayList<File> listOfFiles = new ArrayList<>();
           File[] fileArray = fl.listFiles();
           return fileArray.length;
        }
        else
            return -1;
    
    } 
    public static void main(String[] args) throws IOException {
        String path = "F:\\";
        
//        String fileName ="E:\\HIStud\\Ielts\\CAMBRIDGE IELTS 1 2 3 4 5 6 7 8 9_Full_high quality Ebook and Audio\\Cambridge IELTS 1 (2001)\\Cambridge IELTS 1 (2001) - CD Audio\\ielts21.mp3";
        File fl = new File(path);
//        System.out.println(fl.exists());
//       File[] arr = fl.listFiles();
//        for (File file : arr) {
//            System.out.println(file.getName());
//        }
//        File fl = new File(fileName);
//        System.out.println(fl.isFile());
//        System.out.println(fl.getName().equals("ielts21.mp3"));
        ArrayList<File> al = new ArrayList<>();
//        System.out.println(countFiles(fl));
//        System.out.println(fl.getTotalSpace()/1024/1024/1024+" gb");
//        System.out.println(countAllFiles(fl, al));
        System.out.println(searchFile("air", fl,al));
        String fileToOpen =searchFile("air", fl,al);
        Desktop.getDesktop().open(new File(fileToOpen));
////        System.out.println(File.listRoots()[2].getAbsoluteFile());
//        Desktop.getDesktop();
    }
    
    
}
