package test;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class testa {
    public static void main(String[] args) {
        
        int x = 0x01020304;
         
        ByteBuffer bb = ByteBuffer.wrap(new byte[4]);
        bb.asIntBuffer().put(x);
        String ss_before = Arrays.toString(bb.array());
         
        System.out.println("默认字节序 " +  bb.order().toString() +  ","  +  " 内存数据 " +  ss_before);
    }
}
