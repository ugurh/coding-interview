package bridge;

public class Abstraction {

    Bridge bridge;

    Abstraction(Bridge bridge) {
        this.bridge = bridge;
    }

    public void print(){
        bridge.print();
    }
}
