package NineteenChapter;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Weather extends Thread {

    private static final String weather = "weatherbrocast";
    private static final int port = 1992;
    InetAddress address = null;
    MulticastSocket socket = null;

    Weather() {
        try {
            address = InetAddress.getByName("192.168.196.170");
            socket = new MulticastSocket(port);
            socket.setTimeToLive(1);
            socket.joinGroup(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            DatagramPacket packet = null;
            byte data[] = weather.getBytes();
            packet = new DatagramPacket(data, data.length, address, port);
            System.out.println(new String(data));
            try {
                socket.send(packet);
                sleep(3000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Weather w = new Weather();
        w.start();
    }

}
