package Course.classloader2;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


        ClassLoader parentClassLoader = Magic.class.getClassLoader();
        Class magicClass = parentClassLoader.loadClass("Lesson8.classloader2.Magic");
        Magic magic = (Magic) magicClass.newInstance();
        magic.cast();



        KindMagicClassLoader kindMagicClassLoader = new KindMagicClassLoader(parentClassLoader);
        Class kindMagicClass = kindMagicClassLoader.loadClass("Lesson8.classloader2.Magic");
        /*Magic magic1 = (Magic) kindMagicClass.newInstance();
        magic1.cast возникнет ClassCustExeption так как разные класслоадеры */

        kindMagicClass.getMethod("cast").invoke(kindMagicClass.newInstance(),null);
    }
}
