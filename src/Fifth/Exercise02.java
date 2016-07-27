package Fifth;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise02 {
    static final int lineLength = 81;
    public static void main(String[] args) throws IOException {
        FileWriter fw;
        fw = new FileWriter("userinfo.txt", true);
        try {
            while(true) {
                System.out.println("please input username and password :");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                
                if(s.equals("done")) {
            //String[] a = s.split("\t");
                    break;
                }
                fw.write(s);
                fw.write('\n');
        }
            fw.close();
            System.out.println("write done !");
//            FileReader fr = new FileReader("userinfo.txt");
//            char c[] = new char[1024];
//            int len = fr.read(c);
//            System.out.println("user info : " + new String(c, 0, len));
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
//        FileOutputStream fos;
//        byte[] num = new byte[lineLength];
//        byte[] name = new byte[lineLength];
//        try {
//            fos = new FileOutputStream("userinfo.txt");
//            while(true) {
//                System.out.println("please input name : ");
//                if("done".equalsIgnoreCase(new String(name))) {
//                    System.out.println("ok");
//                    break;
//                }
//                System.out.println("please input num : ");
//                readLine(num);
//                for(int i = 0; num[i] != 0; i++) {
//                    fos.write(num[i]);
//                }
//                fos.write(',');
//                for(int j = 0; name[j] != 0; j++) {
//                    fos.write(name[j]);
//                }
//                fos.write('\n');
//                System.out.println("messages have been write to file");
//            }
//            fos.close();
//        } catch (Exception e) {
//            // TODO 自動生成された catch ブロック
//            e.printStackTrace();
//        }
//    }
//
//    private static void readLine(byte[] name) throws IOException {
//        int b = 0;
//        int i = 0;
//        while((i < (lineLength -1)) && (b = System.in.read()) != '\n') {
//            name[i++] = (byte) b;
//        }
//        name[i] = (byte) 0;
    }
}
