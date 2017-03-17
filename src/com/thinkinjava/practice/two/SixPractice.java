package com.thinkinjava.practice.two;

/**
 * 练习6
 *
 * @author wang_lei
 *
 */
public class SixPractice {

    public static void main(String[] args) {
        SixPractice han = new SixPractice();
        int length = han.storage("i miss you han");
        System.out.println(length);
    }

    public int storage(String s) {
        return s.length() * 2;
    }
}
