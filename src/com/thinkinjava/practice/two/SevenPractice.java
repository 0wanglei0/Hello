package com.thinkinjava.practice.two;

/**
 * 练习7/8
 *
 * @author wang_lei
 *
 */
public class SevenPractice {

    static int j = 12;
    int k = 5;
    public static void main(String[] args) {
        SevenPractice han1 = new SevenPractice();
        SevenPractice han2 = new SevenPractice();
        System.out.println(han1.j++);
        System.out.println(han2.j);
        System.out.println(++han1.k);
        System.out.println(han2.k);
        SevenPractice.increment();
        System.out.println(StaticTest.i);
        
    }

    public static void increment() {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}
