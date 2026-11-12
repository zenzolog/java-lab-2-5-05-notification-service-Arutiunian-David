package notifications;

public abstract class Notification {
    protected String title;

    public Notification(String title) {
        this.title = title;
    }

    public String format() {
        return title + "\n" + formatBody();
    }

    protected abstract String formatBody();
}