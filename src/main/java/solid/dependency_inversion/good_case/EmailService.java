package solid.dependency_inversion.good_case;

public class EmailService implements INotification {

    @Override
    public void send() {
        sendEmail();
    }

    void sendEmail() {
        System.out.println("Email sent...");
    }
}
