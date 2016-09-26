package NineteenChapter;

import java.net.InetAddress;

public class Address {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getByName("user");
            String localName = ip.getHostName();
            String localIp = ip.getHostAddress();
            System.out.println("host name : " + localName);
            System.out.println("host ip : " + localIp);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        
    }
}
