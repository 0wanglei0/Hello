package Enumeration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise03<T> {
    public void doSomething(Exercise03<? extends List<Object>> a) {
        System.out.println(a.getClass().getName());
    }

    public static void main(String[] args) {
        Exercise03<? extends List<Object>> a = new Exercise03<ArrayList<Object>>();
        a.doSomething(new Exercise03<ArrayList<Object>>());
        a.doSomething(new Exercise03<LinkedList<Object>>());
        Exercise03<? super List<Object>> a2 = null;
        a2 = new Exercise03<Object>();
    }
}
