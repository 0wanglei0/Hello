package Enumeration;

public class Exercise01 {

    enum Constants2 {
        ConstantA, ConstantB
    }

    public static void doit2(Constants2 c) {
        switch(c) {
            case ConstantA :
                System.out.println("doit2() ConstantA");
                break;
            case ConstantB :
                System.out.println("doit2() ConstantB");
                break;
        }
    }
    public static void main(String[] args) {
        Exercise01.doit2(Constants2.ConstantA);
        Exercise01.doit2(Constants2.ConstantB);
    }

}
