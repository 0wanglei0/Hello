package com.thinkinjava.practice.five;

public class ArrayInitialize {

    public ArrayInitialize(String s) {
        System.out.println(s);
    }

    Rmb r;
    public ArrayInitialize(Rmb r) {
        this.r = r;
    }

    public static void main(String[] args) {
        // practice 16
        String[] han = new String[3];
        han[0] = new String("h");
        han[1] = new String("a");
        han[2] = new String("n");
        for (int i = 0; i < han.length; i++) {
            System.out.println(han[i]);
        }

        ArrayInitialize[] han1 = new ArrayInitialize[3];
        System.out.println("init s");
        han1[0] = new ArrayInitialize("wang");
        han1[1] = new ArrayInitialize("AI");
        han1[2] = new ArrayInitialize("han");
        for (int i = 0; i < han1.length; i++) {
            System.out.println(han1[i]);
        }
        han1[0].printArray(han);
        System.out.println("init s2");
        han1[1].printArray("h", "a", "n");

        for (Rmb r : Rmb.values()) {
            System.out.println(r + ", " + r.ordinal());
        }

        ArrayInitialize ai = new ArrayInitialize(Rmb.FIFTY);
        switch(ai.r) {
            case TWENTY:
                System.out.println("TWENTY YUAN");
                break;
            case FIFTY:
                System.out.println("FIFTY YUAN");
                break;
            case ONE:
                System.out.println("ONE YUAN");
                break;
            case FIVE:
                System.out.println("FIVE YUAN");
                break;
            case TEN:
                System.out.println("TEN YUAN");
                break;
            case HUNFRED:
                System.out.println("HUNFRED YUAN");
                break;
            default:
                System.out.println("no this value");
        }
    }
    public void printArray(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

}
enum Rmb{
    TWENTY, FIFTY, ONE, FIVE, TEN, HUNFRED
}
