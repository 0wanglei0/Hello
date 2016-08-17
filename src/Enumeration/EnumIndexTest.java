package Enumeration;

public class EnumIndexTest {
    enum Constants2 {
        ConstantsA, ConstantsB, ConstantsC
    }

    public static void main(String[] args) {
        for(int i = 0; i < Constants2.values().length; i++) {
            System.out.println(Constants2.values()[i] + "in enum type location index : "
                    + Constants2.values()[i].ordinal());
        }
    }
}
