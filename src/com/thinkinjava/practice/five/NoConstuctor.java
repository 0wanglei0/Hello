package com.thinkinjava.practice.five;


/**
 * 验证编译器加入了默认构造器
 *
 * @author wang_lei
 *
 */
public class NoConstuctor {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        Student stu1 = new Student ("李明", 20) ; //声明两个对象，内容完全相等

        Student stu2 = new Student ("李明", 20) ; //声明两个对象，内容完全相等


        // 直接在主方法中依次取得各个属性进行比较

        if (stu1.compare(stu2)) {
            System.out.println("两个对象相等！");
        } else {
            System.out.println("两个对象不相等！");
        }
    }
}

class MainClass {}

class Student { 
    private String name;
    private int age;
    public Student (String name,int age) {
        this.setName(name);
        this.setAge(age);
    }

    public boolean compare(Student stu) { //调用此方法时里面存在两个对象：当前对象、传入的对象

        Student s1 = this ;//当前的对象，就表示stu1
        Student s2 = stu ;//传递进来的对象，就表示stu2

        if(s1 == s2) {// 判断是不是同一个对象，用地址比较
            System.out.println("aaaa");
            return true ;
        } //之后分别判断每一个属性是否相等

        if (s1.name.equals(s2.name) && s1.age == s2.age) {
            return true ; //两个对象相等
        } else {
            return false; //两个对象不相等 } }
        }
    }

    public void setName(String name) { //设置姓名
        this.name = name;
    }

    public void setAge(int age) { //设置年龄
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() { 
        return this.age; 
    }
}
