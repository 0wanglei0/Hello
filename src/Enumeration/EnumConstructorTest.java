package Enumeration;

public class EnumConstructorTest {

    enum Constants2 {
        ConstantA("6666666"),
        ConstantB("B"),
        ConstantC("C"),
        ConstantD(3);

        private String description;
        private int i = 4;

        private Constants2() {
        }
        
        private Constants2(String description) {
            this.description = description;
        }

        private Constants2(int i) {
            this.i = this.i + i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < Constants2.values().length; i++) {
            System.out.println(Constants2.values()[i] + "use getDescription() method : " +
                    Constants2.values()[i].getDescription());
        }
        System.out.println(Constants2.valueOf("ConstantD") + "use method getI() : " 
                + Constants2.valueOf("ConstantD").getI());
    }
}
