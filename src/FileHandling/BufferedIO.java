package FileHandling;

import java.io.*;

public class BufferedIO {
    public void readWrite(File file){
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try {
            System.out.println("hello");
            String text ="";
            input = new BufferedInputStream( new FileInputStream(file));
            output = new BufferedOutputStream(new FileOutputStream("src/files/a.txt",true));
            int val = input.read();
            while (val!=-1){
                text += (char)val;
                val = input.read();
            }
            System.out.println(text);
            output.write(text.getBytes());
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try {
                input.close();
                output.close();
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        BufferedIO buff = new BufferedIO();
        buff.readWrite(new File("src/files/hello.txt"));
    }
}
