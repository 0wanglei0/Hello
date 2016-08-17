package Enumeration;

public class ArrayClass<T> {
    private T[] array;
    public T[] getT() {
        return array;
    }
    public void setT(T[] array) {
        this.array = array;
    }
    public static void main(String[] args) {
        ArrayClass<String> a = new ArrayClass<String>();
        String[] array = {"a", "b", "c", "d"};
        a.setT(array);
        for(int i = 0; i < a.getT().length; i++) {
            System.out.println(a.getT()[i]);
        }
    }
}
