package ChapterSixth;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_05 {
    public static void main(String[] args) {
        Class recordC = null;
        try {
            recordC = Class.forName("ChapterSixth.RecordAnnotation");
        } catch (ClassNotFoundException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        System.out.println("Constructor method's describe ----");
        Constructor[] declaredConstructors = recordC.getDeclaredConstructors();
        for(int i = 0; i < declaredConstructors.length; i++) {
            Constructor constructor = declaredConstructors[i];
            if(constructor.isAnnotationPresent((Class<? extends Annotation>)ConstructorAnnotation.class)) {
                ConstructorAnnotation ca = (ConstructorAnnotation) constructor.getAnnotation(ConstructorAnnotation.class);
                System.out.println(ca.value());
            }
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            for(int j = 0; j < parameterAnnotations.length; j++) {
                int length = parameterAnnotations[j].length;
                if(length == 0) {
                    System.out.println(" no add Annotation patameters");
                } else {
                    for(int k = 0; k < length; k++) {
                        FieldMethodParameterAnnotation pa = (FieldMethodParameterAnnotation) parameterAnnotations[j][k];
                        System.out.println("     " + pa.describe());
                        System.out.println("     " + pa.type());
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println(" fields' describe ---------");
        Field[] declaredFields = recordC.getDeclaredFields();
        for(int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            if(field.isAnnotationPresent(FieldMethodParameterAnnotation.class)) {
                FieldMethodParameterAnnotation fa = field.getAnnotation(FieldMethodParameterAnnotation.class);
                System.out.println("   " + fa.describe());
                System.out.println("   " + fa.type());
            }
        }
        System.out.println();
        System.out.println("---- method describe -------");
        Method[] methods = recordC.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            if(method.isAnnotationPresent(FieldMethodParameterAnnotation.class)) {
                FieldMethodParameterAnnotation ma = method.getAnnotation(FieldMethodParameterAnnotation.class);
                System.out.println(ma.describe());
                System.out.println(ma.type());
            }
            Annotation[][] parameterAnnotation = method.getParameterAnnotations();
            for(int j = 0; j < parameterAnnotation.length; j++) {
                int length = parameterAnnotation[j].length;
                if(length == 0) {
                    System.out.println("  no Annotation parameter");
                } else {
                    for(int k = 0; k < length; k++) {
                        FieldMethodParameterAnnotation pa = (FieldMethodParameterAnnotation) parameterAnnotation[j][k];
                        System.out.println("    " + pa.describe());
                        System.out.println("    " + pa.type());
                    }
                }
            }
            System.out.println();
        }
    }
}
