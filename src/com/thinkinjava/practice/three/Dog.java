package com.thinkinjava.practice.three;

public class Dog {

    String name;
    String says;

    public static void main(String[] args) {
        Dog wang = new Dog();
        Dog han = new Dog();
        wang.name = "spot";
        wang.says = "Ruff!";
        han.name = "scruffy";
        han.says = "Wuff!";
        Dog wanghan = new Dog();
        wanghan = wang;
        System.out.println(wanghan == wang);
        System.out.println(wanghan.name == wang.name);
        System.out.println(wanghan.equals(wang));
        System.out.println(wanghan.name.equals(wang.name));
        System.out.println("wang.attribute: ");
        System.out.println("name is " + wang.name);
        System.out.println("says is " + wang.says);
        System.out.println("han.attribute: ");
        System.out.println("name is " + han.name);
        System.out.println("says is " + han.says);
    }

}
