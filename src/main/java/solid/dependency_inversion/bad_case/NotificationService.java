package solid.dependency_inversion.bad_case;

public class NotificationService {

    SmsService smsService = new SmsService();
    EmailService emailService = new EmailService();

    void sendNotification(){
        smsService.send();
        emailService.send();
    }

    public static void main(String[] args) {
       NotificationService notification = new NotificationService();
       notification.sendNotification();
    }
}
