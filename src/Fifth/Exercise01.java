package Fifth;

import java.io.FileInputStream;

import javax.swing.ProgressMonitorInputStream;

public class Exercise01 {
    public static void main(String[] args) {
        byte b[] = new byte[2];
        try {
            FileInputStream fis = new FileInputStream("word.txt");
            ProgressMonitorInputStream pmis = new ProgressMonitorInputStream(null, "read file ...", fis);
            while(pmis.read(b) != -1) {
                String s = new String(b);
                System.out.print(s);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
}
