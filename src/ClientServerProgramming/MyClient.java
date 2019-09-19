package ClientServerProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {
    public void go() throws IOException{

        Socket socket = new Socket("127.0.0.1",4444);
        if (socket.isConnected()){
            System.out.println("connected at: "+socket.getInetAddress());
        }
        else {
            System.out.println("not connected at: "+socket.getInetAddress());
        }
        BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader bSysReader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream pStream = new PrintStream(socket.getOutputStream());
        String text;
        while (true){
            System.out.print("client: ");
            text = bSysReader.readLine();
            pStream.print(text+"\n");
            text = bReader.readLine();
            System.out.print("server: "+text+"\n");
            if(text.equalsIgnoreCase("bye")){
                pStream.print("bye"+"\n");
                break;
            }




        }
        socket.close();
        bReader.close();
        bSysReader.close();
        pStream.close();
    }

    public static void main(String[] args) {
        MyClient client = new MyClient();
        try {
            client.go();
        }
        catch (IOException ex){
            System.out.println("connection error");
        }
    }
}
