package ChapterSixth;

public class Example_03 {
    static void staticMethod() {
        System.out.println("execute method staticMethod");
    }
    public int publicMethod(int i) {
        System.out.println("execute method publicMethod");
        return i* 100;
    }
    protected int protectedMethod(String s, int i) throws NumberFormatException {
        System.out.println("execute method protectedMethod");
        return Integer.valueOf(s) + i;
    }
    private String privateMethod(String... strings) {
        System.out.println("execute method privateMethod");
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < strings.length; i++) {
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }
}
