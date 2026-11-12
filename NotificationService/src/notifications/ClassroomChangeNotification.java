package notifications;

public class ClassroomChangeNotification extends Notification {
    private String newRoom;

    public ClassroomChangeNotification(String newRoom) {
        super("Изменение аудитории");
        this.newRoom = newRoom;
    }

    @Override
    protected String formatBody() {
        return "Пара перенесена в аудиторию " + newRoom;
    }
}