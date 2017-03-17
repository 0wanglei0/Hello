package com.thinkinjava.practice.two;

/**
 * 练习9
 *
 * 知识点：自动包装功能即是[装箱/拆箱](http://www.cnblogs.com/dolphin0520/p/3780005.html)
 * 装箱： Integer.valueOf();
 * 拆箱： Integer.intValue();
 * 上记举例说明，具体情况参照源码
 * [答案来源](http://blog.csdn.net/qq_35396447/article/details/52042234)
 * @author wang_lei
 *
 */
public class NinePractice {

    public static void main(String[] args) {
        int i = 0;
        char c = 'a';
        double d = 1.1;
        boolean b = true;
        long l = 5L;
        float f = 1.0f;
        short s = 3;
        byte by = 4;
        System.out.println(i);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
        System.out.println(l);
        System.out.println(f);
        System.out.println(s);
        System.out.println(by);
        inAddition();
    }

    public static void inAddition() {
        
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
         
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
    }
}
