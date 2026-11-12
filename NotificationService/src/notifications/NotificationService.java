package notifications;

import java.util.List;

public class NotificationService {
    public void broadcast(List<User> users, Notification notification, List<NotificationChannel> channels) {
        String messageText = notification.format();

        for (User user : users) {
            for (NotificationChannel channel : channels) {
                if (user.isNotificationEnabled(channel.id())) {
                    try {
                        channel.send(user, messageText);
                    } catch (NotificationDeliveryException e) {
                        System.out.println(user.getName() + ", " + channel.id() + " — ошибка доставки из-за " + e.getMessage() + ".");
                    }
                } else {
                    System.out.println(user.getName() + ", " + channel.id() + " — пропущено.");
                }
            }
        }
    }
}