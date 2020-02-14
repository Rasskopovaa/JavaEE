package Lesson7.Course;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


    Capucin abau = new Capucin(50);
    Class <Capucin> clazz = (Class<Capucin>) abau.getClass();
    ReflectionUtils.printClass(clazz);

    Capucin mrJenkin = new Capucin(10,100,30);
    Field footSixeField = mrJenkin.getClass().getDeclaredField("footSize");
        footSixeField.setAccessible(true);
        System.out.println(footSixeField.get(mrJenkin));
        footSixeField.set(mrJenkin,32);
        System.out.println(footSixeField.get(mrJenkin));

        Field tailLenghtField = mrJenkin.getClass().getDeclaredField("tailLenght");
        tailLenghtField.setAccessible(true);
        tailLenghtField.set(mrJenkin,1000);
        System.out.println(tailLenghtField.get(mrJenkin));
}
}