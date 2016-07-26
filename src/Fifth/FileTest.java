package Fifth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
    
    public static void main(String args[]) {
        File file = new File("word.txt");
        if(file.exists()) {
            file.delete();
            System.out.println("delete()");
        } else {
            try {
                file.createNewFile();
                String name = file.getName();
                long length = file.length();
                boolean hidden = file.isHidden();
                System.out.println("name:" + name + "length: " + length + "hidden:" + hidden);
                FileOutputStream out = new FileOutputStream(file);
                byte b[] = "wo you yi tou xiao maolv ,conglaidou bu qi".getBytes();
                out.write(b);
                out.close();
                FileInputStream in = new FileInputStream(file);
                byte byy[] = new byte[1024];
                int len = in.read(byy);
                System.out.println("file content : " + new String(byy, 0, len));
                in.close();
            } catch (IOException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
        }
    }
}
