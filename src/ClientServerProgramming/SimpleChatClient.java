package ClientServerProgramming;

import javax.rmi.CORBA.Util;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    JTextArea area;
    JTextField textField;
    Socket socket;
    BufferedReader bufferedReader;
    PrintWriter writer;
    public void go(){
        JFrame frame = new JFrame("Simple chat client");
        JPanel panel = new JPanel();
        area = new JTextArea(15,50);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        textField = new JTextField(20);
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new sendButtonListener());
        panel.add(scrollPane);
        panel.add(textField);
        panel.add(sendButton);
        setUpNetworking();
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setSize(900,500);
        frame.setVisible(true);



    }
    private void setUpNetworking(){
        try{
            socket = new Socket("127.0.0.1",4444);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            bufferedReader= new BufferedReader(streamReader);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("connection established");

        }
        catch (IOException ex){

        }
    }

public class sendButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            writer.println(textField.getText());
            writer.flush();
        }
        catch (Exception ex){

        }
        textField.setText("");
        textField.requestFocus();
    }
}
public class IncomingReader implements Runnable{
        public void run(){
            String message;
            try {
                while ((message = bufferedReader.readLine())!=null){
                    System.out.println("read "+message);
                    area.append(message+"\n");
                }
            }
            catch (Exception ex){

            }
        }
}


    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }
}