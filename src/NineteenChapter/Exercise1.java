package NineteenChapter;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exercise1 {

    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("localhost");
            System.out.println("host name : " + address.getHostName());
            System.out.println("host address : " + address.getHostAddress());
            System.out.println("local host address : " + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
