package Lesson9.Course.Server;

import Lesson9.Course.Client.Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static Integer SERVER_PORT = 4999;

    public static void main(String[] args) {
        ServerListener serverListener = new ServerListener();
        serverListener.start();


        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", Client.CLIENT_PORT);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            OutputStreamWriter toClient = new OutputStreamWriter(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            String message;

            while ((message = scanner.nextLine()) != " ") {
                BufferedWriter bufferedWriter = new BufferedWriter(toClient);
                bufferedWriter.write(message);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
