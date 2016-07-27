package Fifth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("word.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("use method writeUTF() to write data : ");
            dos.writeBytes("Use writeByte() to write data");
            dos.writeChars("use writeChars() to write data");
            dos.close();
            FileInputStream fis = new FileInputStream("word.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
