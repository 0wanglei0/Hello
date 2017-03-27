package com.thinkinjava.practice.five;

public class StaticTest {

    static int num;
    static {
        String name = "han";
        System.out.println(name);
    }
    StaticTest(int num) {
        this.num = num;
        System.out.println(this.num);
    }
    public void print(int num) {
        System.out.println(num);
    }
    public static void main(String[] args) {
        StaticTest han = new StaticTest(99);
        han.print(1);
    }

}
