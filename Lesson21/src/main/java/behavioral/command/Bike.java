package behavioral.command;

public class Bike {
    private boolean leftFlash = false;
    private boolean rightFlash = false;


    public boolean isLeftFlash() {
        return leftFlash;
    }

    public void setLeftFlash(boolean leftFlash) {
        this.leftFlash = leftFlash;
    }

    public boolean isRightFlash() {
        return rightFlash;
    }

    public void setRightFlash(boolean rightFlash) {
        this.rightFlash = rightFlash;
    }


    public void printState() {
        System.out.println("Left flash: + " + leftFlash);
        System.out.println("Right flash: + " + rightFlash);
    }
}
