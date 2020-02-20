package Lesson7.Homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvokationHandler <Integer> implements InvocationHandler {
    MathBox mathBox;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (mathBox.getClass().isAnnotationPresent(Logging.class)) {
            System.out.println("Logging: Method " + method.getName() + " is running");
        }
        Method methods []= mathBox.getClass().getMethods();
        for(Method met : methods){
           if (method.getName().equals(met.getName()) && (method.getParameters().getClass().equals(met.getParameters().getClass())) && met.getAnnotation(ClearData.class) != null){
            Field arrayList = mathBox.getClass().getDeclaredField("arrayList");
                arrayList.setAccessible(true);
                arrayList.set(mathBox,arrayList);
            }
        }
        return method.invoke(mathBox, args);
    }
}
