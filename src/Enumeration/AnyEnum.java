package Enumeration;

interface d {
    public String getDescription();
    public int getI();
}
public enum AnyEnum implements d {
    ConstantA {
        public String getDescription() {
            return ("i feel well");
        }
        public int getI() {
            return i;
        }
    },
    ConstantB {
        public String getDescription() {
            return ("not bad");
        }
        public int getI() {
            return i;
        }
    },
    ConstantC {
        public String getDescription() {
            return ("C");
        }
        public int getI() {
            return i;
        }
    },
    ConstantD {
        public String getDescription() {
            return ("D");
        }
        public int getI() {
            return i;
        }
    };
    private static int i = 5;
    public static void main(String[] args) {
        for(int i = 0; i < AnyEnum.values().length; i++) {
            System.out.println(AnyEnum.values()[i] + "use method getDecription()" + AnyEnum.values()[i].getDescription());
            System.out.println(AnyEnum.values()[i] + "use method getI()" + AnyEnum.values()[i].getI());
        }
    }
}
