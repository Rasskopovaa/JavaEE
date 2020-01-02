package Lesson2.Course;

public class TryCatch {
    public double testDivide (int a,int b) {
        double result = 5;
        try {
            result = a / b;
            return result;
        } catch (Exception e) {
            System.out.println("exception");
            System.exit(0);
        } finally {
            System.out.println("Finally");
        }
        return 0;
    }
}
