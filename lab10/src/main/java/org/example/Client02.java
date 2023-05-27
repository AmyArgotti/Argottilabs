package org.example;
import java.io.*;
import java.net.*;

public class Client02 {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 5000;

    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Connected to server");

            // Get input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Get username from user
            System.out.print("Who are you? ");
            String username = input.readLine();

            // Send username to server
            output.println(username);

            // Get response from server and print it
            String serverResponse = serverInput.readLine();
            System.out.println(serverResponse);

            // Start chat
            String message;
            int messageNum = 1;
            while (true) {
                System.out.print("> ");
                message = input.readLine();
                output.println(message);

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Disconnected from server");
                    break;
                }

                // Get response from server and print it
                serverResponse = serverInput.readLine();
                System.out.printf("Server Response %d: %s\n", messageNum++, serverResponse);
            }

            // Close streams and socket
            input.close();
            output.close();
            serverInput.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
