package org.example;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORT=34522;

    public static void main(String[] args) {


        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started and listening on port... " );

            while (true) {
                Socket client = serverSocket.accept();
                System.out.println(client.getRemoteSocketAddress());


                try(
                        Socket clientSocket = serverSocket.accept();

                        DataInputStream input= new DataInputStream(clientSocket.getInputStream());
                        DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream())
                ){

                    String username= input.readUTF();
                    System.out.println("from who : "+username);
                    output.writeUTF("Hello"+username);

                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
    }
}
