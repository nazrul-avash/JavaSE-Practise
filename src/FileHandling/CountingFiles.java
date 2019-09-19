package FileHandling;

import java.io.File;

 class CountingFiles
{   private final static int divisor= 1021*1024*1024;
    public static String findFile(File file,String name){

        File[] f = file.listFiles();
        if(!(f.length<1)) {
            for (int i = 0; i < f.length; i++) {
                System.out.println(name);
                if (f[i].isFile() && name.equals(f[i].getName())) {
                    return f[i].getAbsolutePath();

                } else if (f[i].isDirectory()) {
                    //System.out.println(f[i].getAbsolutePath());
                    findFile(f[i], name);
                }
            }
        }
        return "no file";
    }
    public static int countFile(File file){
        int count =0;

        if(file.isDirectory()){
            File[] f = file.listFiles();
            count= f.length;
            for (int i=0;i<f.length;i++){
                System.out.println(f[i].getName());
            }
            return count;
        }
        else return 1;

    }
    public static void main(String[] args) {
        final String path = "/home/nazrul/Downloads";
        String fileToFind = "main.css";
        File file = new File(path);
        /*System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        System.out.println("free space: "+ file.getFreeSpace()/divisor);
        System.out.println(file.getPath());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println("total space: "+file.getTotalSpace()/divisor);
        System.out.println("usable space: "+file.getUsableSpace()/divisor);*/
        //System.out.println(countFile(file));//counts the number of file in any given diretory;
        System.out.println(findFile(file,fileToFind));
    }
}
