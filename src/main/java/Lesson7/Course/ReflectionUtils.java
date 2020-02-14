package Lesson7.Course;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    private ReflectionUtils(){}

    public static void printClass(Class clazz) {
        printFields(clazz);
        System.out.println();
        printDeclaredFields(clazz);
        System.out.println();
        printMethods(clazz);
    }
    private static void printMethods(Class clazz){
        System.out.println();
        System.out.println("Class"+ clazz.getName()+ "getMethods");
        methodIterator(clazz.getMethods());
    }
    private static void methodIterator (Method[] methods){
        for(Method method : methods){
            System.out.print("Name = "+ method.getName());
            System.out.println(" return type "+ method.getReturnType().getCanonicalName());
            System.out.println("Parameters:");
            for(Class parameterClass: method.getParameterTypes()){
                System.out.print(parameterClass.getName());
            }
            System.out.println();
        }

    }
        private static void printFields(Class clazz){
            System.out.println("Class"+ clazz.getName()+ "getFields");
            fieldIterator(clazz.getFields());
        }
        public static void fieldIterator(Field[] fields) {
            for (Field field : fields) {
                System.out.print("name " + field.getName() + " type = " + field.getType().getCanonicalName());
                System.out.println(" modifier " + field.getModifiers());
            }
        }
            private static void printDeclaredFields(Class clazz){
                System.out.println("Class"+ clazz.getName()+ "getDeclaredFields");
                fieldIterator(clazz.getDeclaredFields());
            }
    }

