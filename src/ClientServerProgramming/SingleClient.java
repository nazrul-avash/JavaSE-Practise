package ClientServerProgramming;

import java.io.*;
import java.net.Socket;

public class SingleClient {
    public void go(){

        OutputStreamWriter out = null;
        try {
            Socket socket = new Socket("127.0.0.1",4444);
            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            BufferedReader bReader = new BufferedReader(in);
            String text = bReader.readLine();
            while(text.equals("quit")==false){
                System.out.println(text);
                text= bReader.readLine();
            }
            bReader.close();
        }
        catch (IOException ex){

        }


    }

    public static void main(String[] args) {
        SingleClient client = new SingleClient();
        client.go();
    }
}
