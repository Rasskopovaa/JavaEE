package fundamentalPatterns.abstractSuperClass;

public class Main {
    public static void main(String[] args) {
        // Location location = new Location();
        Line line = new Line(1, 1, 4, 4);
        line.setXY(5, 5);
        System.out.println(line);
        line.moveLeft(3);
        System.out.println(line);
    }
}
