package org.example;
import java.io.*;
import java.net.*;

public class Server02 {
    private ServerSocket serverSocket;
    private int clientCount;

    public Server02(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started and listening on port " + port);
            clientCount = 0;
        } catch (IOException e) {
            System.out.println("Error starting server: " + e.getMessage());
        }
    }

    public void start() {
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client " + (++clientCount) + " connected");
                new ClientHandler(clientSocket, clientCount).start();
            }
        } catch (IOException e) {
            System.out.println("Error accepting client connection: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;
    private int clientId;
    private String username;

    public ClientHandler(Socket clientSocket, int clientId) {
        this.clientSocket = clientSocket;
        this.clientId = clientId;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Request username from client
            out.println("Please enter your username:");
            username = in.readLine();
            System.out.println("Client " + clientId + " is " + username);

            // Send greeting to client
            out.println("Hello, " + username);

            // Start echo server mode
            int messageCount = 0;
            while (true) {
                String message = in.readLine();
                if (message == null || message.equals("bye")) {
                    break;
                } else if (username.equals("admin") && message.equals("exit")) {
                    System.out.println("Server is shutting down as requested by admin");
                    System.exit(0);
                } else {
                    System.out.println("Message from client " + clientId + ": " + message);
                    out.println("Message " + (++messageCount) + " from " + username + ": " + message);
                }
            }

            // Close socket
            in.close();
            out.close();
            clientSocket.close();
            System.out.println("Client " + clientId + " disconnected");
        } catch (IOException e) {
            System.out.println("Error handling client " + clientId + ": " + e.getMessage());
        }
    }
}
