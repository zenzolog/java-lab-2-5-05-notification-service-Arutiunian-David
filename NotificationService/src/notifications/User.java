package notifications;

import java.util.List;

public class User {
    private String id;
    private String name;
    private String email;
    private String phone;
    private List<String> allowedChannels;

    public User(String id, String name, String email, String phone, List<String> allowedChannels) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.allowedChannels = allowedChannels;
    }

    public boolean isNotificationEnabled(String channelId) {
        return allowedChannels.contains(channelId);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}