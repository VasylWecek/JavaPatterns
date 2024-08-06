package main.java.com.vasylwecek.basepatterns.structural.decorator;

public class EmailNotifier implements Notifier {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}
