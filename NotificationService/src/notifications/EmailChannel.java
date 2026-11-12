package notifications;

public class EmailChannel implements NotificationChannel {
    @Override
    public String id() { return "Email"; }

    @Override
    public void send(User user, String message) {
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new NotificationDeliveryException("отсутствует email");
        }
        System.out.println(user.getName() + ", Email — доставлено. (Кому: " + user.getEmail() + ")");
    }
}