package solid.dependency_inversion.good_case;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    static void sendNotification(List<INotification> notifications) {
        notifications.forEach(INotification::send);
    }

    public static void main(String[] args) {

        List<INotification> notifications = new ArrayList<>();
        notifications.add(new SmsService());
        notifications.add(new EmailService());

        sendNotification(notifications);
    }
}
