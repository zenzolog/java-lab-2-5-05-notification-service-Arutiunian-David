package notifications;

public class SmsChannel implements NotificationChannel {
    @Override
    public String id() { return "SMS"; }

    @Override
    public void send(User user, String message) {
        if (user.getPhone() == null || user.getPhone().isEmpty()) {
            throw new NotificationDeliveryException("отсутствует номер телефона");
        }
        System.out.println(user.getName() + ", SMS — доставлено. (Кому: " + user.getPhone() + ")");
    }
}