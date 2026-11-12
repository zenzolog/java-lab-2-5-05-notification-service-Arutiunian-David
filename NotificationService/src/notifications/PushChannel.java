package notifications;

public class PushChannel implements NotificationChannel {
    @Override
    public String id() { return "Push"; }

    @Override
    public void send(User user, String message) {
        if (user.getId() == null || user.getId().isEmpty()) {
            throw new NotificationDeliveryException("отсутствует ID пользователя");
        }
        System.out.println(user.getName() + ", Push — доставлено. (ID: " + user.getId() + ")");
    }
}