package Enumeration;

public class EnumMethodTest {
    enum Constants2 {
        ConstantB, ConstantA, ConstantC
    }

    public static void compare(Constants2 c) {
        for(int i = 0; i < Constants2.values().length; i++) {
            System.out.println(c + "and " + Constants2.values()[i]
                    + " compare the result is : " + c.compareTo(Constants2.values()[i]));
        }
    }
    public static void main(String[] args) {
        compare(Constants2.valueOf("ConstantB"));
    }
}
