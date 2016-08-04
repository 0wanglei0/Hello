package ChapterSixth;

import java.lang.reflect.Array;

public class Exercise_01 {
    public static void main(String[] args) {
        Test test = new Test();
        test.print();
        test.a = (int[]) addArrayLength(test.a, 10);
        test.s = (String[]) addArrayLength(test.s, 10);
        test.print();
    }
    
    public static Object addArrayLength(Object array, int newLength) {
        Object newArray = null;
        Class componentType = array.getClass().getComponentType();
        newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(array, 0, newArray, 0, Array.getLength(array));
        return newArray;
    }
}

class Test {
    public int[] a = {1, 2, 3};
    public String[] s = {"A", "B", "X"};
    public void print() {
        for(int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println();
        for(int i = 0; i < s.length; i++) {
            System.out.println("s[" + i + "] = " + s[i]);
        }
        System.out.println();
    }
}
