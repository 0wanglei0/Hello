package com.thinkinjava.inaddition;

/**
 * equals() 和  ==
 *
 * @author wang_lei
 *
 */
public class OperationTest {
    public static void main(String[] args) { 

        //对于基本类型的变量。"=="和"equal"的区别 
        int t1=57; 
        int t2=67; 
        int t3=124; 
        int t4=124; 

        //“==”对于基本数据类型，判断两个变量的值是否相等。 
        Boolean result1=(t1==t2); 
        Boolean result2=((t1+t2)==t3); 
        Boolean result3=(t3==t4); 

        System.out.println("/n/n-----【t1==t2】"+result1+"/n-----【(t1+t2)=t3】"+result2+"/n-----【t3=t4】"+result3); 
        //“equal”不能用于基本数据类型。只能用于类变量。对于基本数据类型要用其包装类。 
        Integer i1=new Integer(t1); 
        Integer i2=new Integer(t2); 
        Integer i3=new Integer(t3); 
        Integer i4=new Integer(t4); 


        Boolean ri1=i1.equals(i2); 
        Boolean ri2=i3.equals(i1+i2); 
        Boolean ri3=i3.equals(i4); 

        System.out.println("/n/n-----【i1.equals(i2)】"+ri1+"/n-----【i3.equals(i1+i2)】"+ri2+"/n-----【i3.equals(i4)】"+ri3); 

        //对于对象变量，"=="和"equal"的区别 

        String st1="wasiker "; 
        String st2="is super man"; 
        String st3="wasiker is super man"; 
        String st4="wasiker is super man"; 

        Boolean b1=(st1==st2); 
        Boolean b2=(st1+st2)==st3; 
        Boolean b3=(st3==st4); 

        System.out.println("/n/n-----【st1==st2】"+b1+"/n-----【(st1+st2)==st3】"+b2+"/n-----【st3==st4】"+b3); 

        //因为对象变量的存储的是对象在内存中的路径，即内存地址。所以用“==”比较时，即使 
        //对象的值相等，但是他们的内存地址不同，所以==的结果为false。故“==”用于比较两 
        //个变量的值是否相等，而不是变量引用的对象是否相等 

        Boolean r1=st1.equals(st2); 
        Boolean r2=(st1+st2).equals(st3); 
        Boolean r3=st3.equals(st4); 

        System.out.println("/n/n-----【st1.equals(st2)】"+r1+"/n-----【(st1+st2).equals(st3)】"+r2+"/n-----【st3.equals(st4)】"+r3); 

        //equal用于比较两个对象是否相同。 
    } 
} 
