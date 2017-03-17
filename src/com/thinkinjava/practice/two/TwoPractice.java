package com.thinkinjava.practice.two;

/**
 * 练习2： 输出hello， world  方式：javac 编译， java 执行 （命令行）
 * 练习3： 创建一个类，并创建这个类的对象
 * @author wang_lei
 *
 */
public class TwoPractice {

    public static void main(String[] args) {
        // 练习3
        TwoPractice han = new TwoPractice();
        System.out.println(han.hashCode());
        // 练习2
        System.out.println("Hello, World");
    }
}
