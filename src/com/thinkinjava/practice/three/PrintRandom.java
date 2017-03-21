package com.thinkinjava.practice.three;

public class PrintRandom {

    public static void main(String[] args) {
        // new PrintRandom().compareNum();
        // new PrintRandom().print();
        // new PrintRandom().printPrime(30);
        new PrintRandom().testSwitch();
        new PrintRandom().getFibonacci(10);
    }

    public void compareNum() {
        for (int i = 0; i < 25; i++) {
            int num = (int)(Math.random() * 1000);
            int nextNum = (int)(Math.random() * 1000);
            if (num < nextNum) {
                System.out.println("small");
            } else if (num == nextNum) {
                System.out.println("equals");
            } else {
                System.out.println("big");
            }
        }
    }

    public void print() {
        String han = "han";
        while (han.equals("han")) {
            System.out.println("i love you " + han);
        }
    }

    public void printPrime(int num) {
        for (int i = 1; i < num; i++) {
            int count = 0;
            for (int j = 1; j < (i + 2) / 2; j++) {
                if ((i % j) == 0) {
                    count++; // 记录是否出现能被整除的数
                }
            }
            if (count < 2) { // 被1整除计一次
                System.out.println("数字：" + i + "  是素数");
            }
        }
    }

    public void testSwitch() {
        for (int i = 0; i < 5; i++) {
            switch (i){
                case 0:
                    System.out.println("当前为：" + i);

                case 1:
                    System.out.println("当前为：" + i);

                case 2:
                    System.out.println("当前为：" + i);

                case 3:
                    System.out.println("当前为：" + i);

                case 4:
                    System.out.println("当前为：" + i);
                default:
                    System.out.println("nothing");
            }
        }
    }

    public void getFibonacci(int n) {
        int fibo[] = new int[n + 2];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            System.out.println(fibo[i]);
        }
    }
}
