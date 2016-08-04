package ChapterSixth;

import java.lang.reflect.Field;

public class GetFieldTest {
    public static void main(String[] args) {
        Example_02 example = new Example_02();
        Class exampleC = example.getClass();
        Field[] declaredFields = exampleC.getDeclaredFields();
        for(int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            System.out.println("name is : " + field.getName());
            Class fieldType = field.getType();
            System.out.println("type is : " + fieldType);
            boolean isTurn = true;
            while(isTurn) {
                try {
                    isTurn = false;
                    System.out.println("before change's value : " + field.get(example));
                    if(fieldType.equals(int.class)) {
                        System.out.println("use method setInt() to change member field's values");
                        field.setInt(example, 168);
                    } else if (fieldType.equals(float.class)) {
                        System.out.println("use method setFloat() to change the member field's values");
                        field.setFloat(example, 99.09F);
                    } else if (fieldType.equals(boolean.class)) {
                        System.out.println("use method setBoolean() to change the member field's values");
                        field.setBoolean(example, true);
                    } else {
                        System.out.println("use method set() to change the member field's values");
                        field.set(example, "aaaa");
                    }
                    System.out.println("After changed ,the fields' values : " + field.get(example));
                } catch (Exception e) {
                    System.out.println("while set field's values throw exception, " + "after that will execute method setAccessible()");
                    field.setAccessible(true);
                    isTurn = true;
                }
            }
        }
    }
}
class Example_02 {
    int i = 0;
    public float f;
    protected boolean b;
    private String s;
}
