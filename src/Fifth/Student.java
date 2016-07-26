package Fifth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {

    public static void main(String[] args) {
        String contents[] = {"hi", "hello", "ohayo"};
        File file = new File("word.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String str : contents) {
                bw.write(str);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            int i = 0;
            while((s = br.readLine()) != null) {
                    System.out.println("this is the line : " + i + "," + "and the content is : " + s);
                    i++;
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
}
