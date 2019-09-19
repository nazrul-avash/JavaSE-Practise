package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WritingIntoTextFile {
    public static int countWord(File file){
        int x =0;
       try {
           int i =0;
           String str ="";
           FileInputStream fin = new FileInputStream(file);
           while ((i =fin.read())!=-1){
                str+=(char)i;
           }
           String array[] = str.trim().split("\\s+");
           x = array.length;
       }
       catch (Exception ex){
           System.out.println(ex);
       }
       return x;
    }
    public static void main(String[] args) {
        File file = new File("/mnt/5b8a27ae-f4ca-48ee-953c-41e830e92084/nazrul/javaProjects/JavaStandard/src/files/hello.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file);
            String str ="Canonical path is an absolute path and it is always unique.\n If the path is not absolute it converts into an absolute path and then cleans up the path by removing and resolving stuff like ., .., resolving symbolic links and converting drive letters to a standard case (on Microsoft Windows platforms). We will go through few examples to know what this means.";
            byte[] b= str.getBytes();
            fout.write(b);
            fout.close();

        }
        catch (Exception e){
            System.err.println(e);
        }
        System.out.println(countWord(file));
    }
}
