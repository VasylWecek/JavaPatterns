package main.java.com.vasylwecek.basepatterns.creation.singleton;

public class ServerConnection {
    private static ServerConnection instance;

    private ServerConnection() {
        System.out.println("Server Connection");
    }

    public static synchronized ServerConnection getInstance() {
        if (instance == null) {
            instance = new ServerConnection();
        }
        return instance;
    }

    public void sendData(String data) {
        System.out.println("Server send data");

    }

    public String receiveData() {
        return "Server receive data";
    }
}
