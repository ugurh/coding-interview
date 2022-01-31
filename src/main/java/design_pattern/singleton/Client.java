package design_pattern.singleton;

public class Client {

    public static void main(String[] args) {
        AirforceOne airforce = AirforceOne.getInstance();
        airforce.flying();
    }
}
