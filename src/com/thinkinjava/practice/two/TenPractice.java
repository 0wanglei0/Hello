package com.thinkinjava.practice.two;

/**
 * 打印命令行参数
 * 执行时添加参数
 *
 * @author wang_lei
 *
 */
public class TenPractice {

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("no argument");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }

}
