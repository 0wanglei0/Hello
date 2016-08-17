package Enumeration;

interface Constants {
    public static final int ConstantA = 1;
    public static final int ConstantB = 12;
}

public class ConstantsTest {
    enum Constants2 {
        ConstantA, ConstantB
    }
    //use interface to define variable
    public static void doit(int c) {
        switch(c) {
            case Constants.ConstantA :
                System.out.println("doit() ConstantA");
                break;
            case Constants.ConstantB :
                System.out.println("doit() ConstantB");
                break;
        }
    }

    //define the method that the param is a enum object
    //and do something different by the param
    public static void doit2(Constants2 c) {
        switch(c) {
            case ConstantA:
                System.out.println("doit() Constants2.ConstantA");
                break;
            case ConstantB:
                System.out.println("doit() Constants2.ConstantB");
                break;
        }
    }

    public static void main(String[] args) {
        ConstantsTest.doit(Constants.ConstantA);
        ConstantsTest.doit2(Constants2.ConstantA);
        ConstantsTest.doit2(Constants2.ConstantB);
        ConstantsTest.doit(3);
//        ConstantsTest.doit2(3);
    }
}
