package Course.classloader;

public class Main {
    public static void main(String[] args) {
       /* Some some = new Some("some value");
        ClassLoader classLoader = some.getClass().getClassLoader();
        System.out.println(classLoader);
        String someString = "Some";
        ClassLoader classLoader1 = someString.getClass().getClassLoader();
        System.out.println(classLoader1);//получим null, так как обратиться к Bootstrap не можем*/
       System.setSecurityManager(new SecurityManager());
       SecurityManager  securityManager = System.getSecurityManager();
        System.out.println(securityManager);
    }
}
