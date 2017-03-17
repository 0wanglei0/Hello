package com.thinkinjava.practice.two;

/**
 * 练习4、练习5
 *
 * @author wang_lei
 *
 */
public class FourPractice {

    public static void main(String[] args) {
        DataOnly han = new DataOnly();
        han.i = 47;
        han.d = 1.1;
        han.b = true;
        System.out.println(han.i + ", " + han.d + ", " + han.b);
    }

}

class DataOnly {
    int i;
    double d;
    boolean b;
}