package structural.bridje;

public abstract class Transport {
    protected Handler handler;

    public Transport(Handler handler) {
        this.handler = handler;
    }

    public abstract void workWith();
}
