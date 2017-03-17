package com.thinkinjava.practice.two;

/**
 * 创建一个类，包含一个int域和一个char域（这里的域时间上指的是字段 field）
 * 都没有被初始化，将他们的值打印出来，验证java的默认初始化行为
 *
 * 编码时注意规范
 *
 * @author wang_lei
 *
 */
public class OnePractice {
    int a;
    char c;

    public int getA() {
        return a;
    }

    public char getC() {
        return c;
    }

    public static void main(String[] args) {
        OnePractice instance = new OnePractice();
        System.out.println(instance.getA());
        System.out.println(instance.getC());
    }
}
