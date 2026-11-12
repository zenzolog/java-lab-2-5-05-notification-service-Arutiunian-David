package notifications;

public class DeadlineReminderNotification extends Notification {
    private String workName;
    private String deadlineDate;

    public DeadlineReminderNotification(String workName, String deadlineDate) {
        super("Напоминание о дедлайне");
        this.workName = workName;
        this.deadlineDate = deadlineDate;
    }

    @Override
    protected String formatBody() {
        return "Срок сдачи работы \"" + workName + "\" — " + deadlineDate;
    }
}