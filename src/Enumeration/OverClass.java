package Enumeration;

public class OverClass<T> {
    private T over;
    public void setOver(T over) {
        this.over = over;
    }
    public T getOver() {
        return over;
    }
    public static void main(String[] args) {
        OverClass<Boolean> over1 = new OverClass<Boolean>();
        over1.setOver(true);
        OverClass<Float> over2 = new OverClass<Float>();
        over2.setOver(12.3f);
        boolean b = over1.getOver();
        float f = over2.getOver();
        System.out.println(b + ", " + f);
    }
}
