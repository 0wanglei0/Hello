package com.thinkinjava.inaddition;

public class DefineArray {

    public static void main(String[] args) {
        // 定义的变量实际是引用 
        int arr[] = new int[3];
        int[] arr2;
        arr2 = arr;
        // 上记arr2改变时  arr也会变  实际上arr2的和arr的值都是这个数组的引用
        String str[] = {"1"}; // c/c++程序员的习惯
        char c[] = new char[]{'a'};
    }

}
