package com.thinkinjava.practice.Five;

/**
 * http://blog.csdn.net/qq_35396447/article/details/52224999
 * String s = new String("abc");
 * String s1 = "abc";
 * String s2 = new String("abc");
 * three object
 *
 * @author wang_lei
 *
 */
public class StringInitialization {

    public String s = "hanxiaochen";

    public StringInitialization(String st) {
        this.s = st;
    }

    public static void main(String[] args) {
        StringInitialization han = new StringInitialization("test");
        System.out.println(han.s);
    }
}
