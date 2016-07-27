package Fifth;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise03 {
    public static void main(String[] args) {
        char a[] = "today go to home at 5 o'clock.".toCharArray();
        int n = 0;
        try {
            File file = new File("word.txt");
            for(int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 'R');
            }
            FileWriter fw = new FileWriter(file);
            fw.write(a, 0, a.length);
            fw.close();
            FileReader fr = new FileReader(file);
            char tom[] = new char[10];
            System.out.println("After MD : ");
            while((n = fr.read(tom, 0, 10)) != -1) {
                String s = new String(tom, 0, n);
                System.out.println(s);
            }
            fr.close();
            fr = new FileReader(file);
            System.out.println("Before MD : ");
            while((n = fr.read(tom, 0, 10)) != -1) {
                for(int j = 0; j < n; j++) {
                    tom[j] = (char)(tom[j] ^ 'R');
                }
                String str = new String(tom, 0, n);
                System.out.println(str);
            }
            fr.close();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
}
