import notifications.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> annaChannels = List.of("Email", "SMS");
        User anna = new User("1", "Анна", "anna@example.com", null, annaChannels);

        List<String> borisChannels = List.of("SMS", "Push");
        User boris = new User("2", "Борис", "boris@example.com", "+79991234567", borisChannels);

        List<User> users = List.of(anna, boris);

        NotificationService service = new NotificationService();

        System.out.println("--- Ожидаемый результат первого запуска: ---");
        Notification notification1 = new ClassroomChangeNotification("304");

        List<NotificationChannel> channels1 = new ArrayList<>();
        channels1.add(new EmailChannel());
        channels1.add(new SmsChannel());

        service.broadcast(users, notification1, channels1);

        System.out.println("\n--- ВТОРОЙ ЗАПУСК (Дополнительно) ---");
        Notification notification2 = new DeadlineReminderNotification("Лабораторная № 5", "13 ноября");

        List<NotificationChannel> channels2 = new ArrayList<>();
        channels2.add(new EmailChannel());
        channels2.add(new SmsChannel());
        channels2.add(new PushChannel());

        service.broadcast(users, notification2, channels2);
    }
}