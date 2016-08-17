package Enumeration;
import static java.lang.System.*;
public class showEnum {
    enum Constants2 {
        ConstantA,
        ConstantB
    }

    public static void main(String[] args) {
        for(int i = 0; i < Constants2.values().length; i++) {
            out.println("enum members: " + Constants2.values()[i]);
        }
    }
}
