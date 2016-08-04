package ChapterSixth;

import java.lang.reflect.Method;

public class Main_03 {
    public static void main(String[] args) {
        Example_03 example = new Example_03();
        Class exampleC = example.getClass();
        Method[] declaredMethods = exampleC.getDeclaredMethods();
        for(int i = 0; i < declaredMethods.length; i++) {
            Method method = declaredMethods[i];
            System.out.println("name is : " + method.getName());
            System.out.println("isVarArgs : " + method.isVarArgs());
            System.out.println("parameters type :");
            Class[] parameterTypes = method.getParameterTypes();
            for(int j = 0; j < parameterTypes.length; j++) {
                System.out.println(" " + parameterTypes[j]);
            }
            boolean isTurn = true;
            while(isTurn) {
                try{
                    isTurn = false;
                    if("staticMethod".equals(method.getName())) {
                        method.invoke(example);
                    } else if ("publicMethod".equals(method.getName())) {
                        System.out.println("the return is : " + method.invoke(example, 168));
                    } else if ("protectedMethod".equals(method.getName())) {
                        System.out.println("return is : " + method.invoke(example, "7", 5));
                    } else if ("privateMethod".equals(method.getName())) {
                        Object[] parameters = new Object[] {
                                new String[] {"M", "W", "Q"}
                        };
                        System.out.println("the return is : " + method.invoke(example, parameters));
                    }
                } catch (Exception e){
                    System.out.println("while execute the method, throw exception, " + "and execute the method setAccessible()");
                    method.setAccessible(true);
                    isTurn = true;
                }
            }
        }
        System.out.println();
    }
}
