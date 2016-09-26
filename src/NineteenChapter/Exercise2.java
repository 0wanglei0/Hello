package NineteenChapter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8001);
            while (!ss.isClosed()) {
                Socket s = ss.accept();
                InputStream ips = s.getInputStream();
                OutputStream ops = s.getOutputStream();
                String str = "welcome to this program\n.";
                ops.write(str.getBytes());
                byte[] buf = new byte[1024];
                int len = 0;
                if (ips.available() > 0) {
                    len = ips.read(buf);
                }
                System.out.println(new String(buf, 0, len));
                ips.close();
                ops.close();
                s.close();
            }
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
