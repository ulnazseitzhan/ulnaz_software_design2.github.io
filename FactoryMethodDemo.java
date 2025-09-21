interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

abstract class NotificationFactory {
    public abstract Notification createNotification();
}

class EmailFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailFactory();
        Notification email = factory.createNotification();
        email.send("Hello via Email!");

        factory = new SMSFactory();
        Notification sms = factory.createNotification();
        sms.send("Hello via SMS!");
    }
}
