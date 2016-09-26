package NineteenChapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {
    private BufferedReader reader;
    private ServerSocket server;
    private Socket socket;
    void getServer() {
        try {
            server = new ServerSocket(5678);
            System.out.println("server socket has been estalished successfully");
            while (true) {
                System.out.println("wait for client connectioning...");
                socket = server.accept();
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getClientMessage() {
        try {
            while (true) {
                System.out.println("client : " + reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (reader != null) {
                reader.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTcp tcp = new MyTcp();
        tcp.getServer();
    }
}
