package com.hihusky.net.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

public class Client {
        public static void main(String[] args) {
            String serverAddress = "localhost"; // 或者使用服务器IP地址
            int serverPort = 12345;

            try (Socket socket = new Socket(serverAddress, serverPort)) {
                // 连接成功，向服务端发送一条信息
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                writer.println("Hello, server! This is a message from the client.");
            } catch (IOException e) {
                System.err.println("Error in the client: " + e.getMessage());
            }
        }
}
