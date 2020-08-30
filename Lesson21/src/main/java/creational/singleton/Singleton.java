package creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton localinstance = instance;
        if (localinstance == null) {
            synchronized (Singleton.class) {
                localinstance = instance;
                if (localinstance == null) {
                    instance = localinstance = new Singleton();
                }
            }
        }
        return localinstance;
    }
}
