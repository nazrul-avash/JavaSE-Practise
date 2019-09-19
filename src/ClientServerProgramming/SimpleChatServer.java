package ClientServerProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleChatServer {
    ArrayList clientOutputStreams;
    public class ClientHandler implements Runnable{
        Socket sock;
        BufferedReader reader;
        ClientHandler(Socket clientSocket){
            try {
                sock = clientSocket;
                InputStreamReader iReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(iReader);
            }
            catch (IOException ex){

            }

        }

        @Override
        public void run() {
            String message;
            try {
                while ((message=reader.readLine())!=null){
                    System.out.println("read "+message);
                    tellEveryOne(message);
                }
            }
            catch (IOException ex){

            }
        }

    }
    public void go(){
        clientOutputStreams = new ArrayList();
        try {
            ServerSocket serverSocket = new ServerSocket(4444);
            while (true){
                Socket clientSocket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);
                Thread thread = new Thread(new ClientHandler(clientSocket));
                thread.start();
                System.out.println("Got a connection");
            }
        }
        catch (Exception ex){

        }
    }
    public void tellEveryOne(String message){
        Iterator it = clientOutputStreams.iterator();
        while (it.hasNext()){
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            }
            catch (Exception ex){

            }
        }
    }

    public static void main(String[] args) {
        SimpleChatServer server = new SimpleChatServer();
        server.go();
    }
}
