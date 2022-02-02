package solid.dependency_inversion.good_case;

public class SmsService implements INotification {

    @Override
    public void send() {
        sendSMS();
    }

    void sendSMS() {
        System.out.println("SMS sent...");
    }
}
