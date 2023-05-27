package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1010);

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        // first message

        System.out.println(in.readUTF());
        out.writeUTF(scanner.nextLine());

        Thread receiver = new Thread(new Runnable() {
            private String msg;
            @Override
            public void run() {
                try {
                    msg = in.readUTF();
                    while(msg != null){
                        System.out.println("Server says: " + msg);
                        msg = in.readUTF();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread sender = new Thread(new Runnable() {
            private String msg;
            @Override
            public void run() {
                try {
                    while(true){
                        msg = scanner.nextLine();

                        out.writeUTF(msg);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        sender.start();
        receiver.start();
    }
}