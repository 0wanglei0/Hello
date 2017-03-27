package com.thinkinjava.practice.five;

public class InitilizedString {

    String s;
    {
        s = new String("han");
    }
    public InitilizedString() {
        System.out.println(s);
    }
    public static void main(String[] args) {
        new InitilizedString();
    }

}
