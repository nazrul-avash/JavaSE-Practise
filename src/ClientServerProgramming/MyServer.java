package ClientServerProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public void go() throws IOException{
        ServerSocket socket = new ServerSocket(4444);
        Socket sock = socket.accept();
        if(sock.isConnected()){
            System.out.println("a client has connected at: "+sock.getLocalPort());
        }
        BufferedReader bSysReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        PrintStream pStream = new PrintStream(sock.getOutputStream());
        String text;
        while (true){
            text = bReader.readLine();
            if(text.equalsIgnoreCase("bye")){
                pStream.print("bye");
                break;
            }
            System.out.print("client: "+text+"\n");
            System.out.print("server: ");
            text = bSysReader.readLine();
            pStream.print(text+"\n");

        }
        sock.close();
        socket.close();
        bReader.close();
        bSysReader.close();
        pStream.close();

    }

    public static void main(String[] args) {
        MyServer server = new MyServer();
        try {
            server.go();
        }
        catch (IOException ex){

        }
    }
}
