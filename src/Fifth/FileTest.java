package Fifth;

import java.io.File;
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
            } catch (IOException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
        }
    }
}
