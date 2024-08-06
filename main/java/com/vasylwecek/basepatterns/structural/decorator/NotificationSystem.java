package main.java.com.vasylwecek.basepatterns.structural.decorator;

public class NotificationSystem {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier("admin@example.com");

        notifier = new SMSNotifier(notifier, "+123456789");

        notifier = new FacebookNotifier(notifier, "facebookUser123");

        notifier.send("Критическое уведомление: Проблема с сервером!");
    }
}
