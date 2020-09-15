package behavioral.state;

public class Bike {
    private boolean engineRunning;
    private boolean riding;
    private State state = new OffState(this);

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public boolean isRiding() {
        return riding;
    }

    public void setRiding(boolean riding) {
        this.riding = riding;
    }
}
