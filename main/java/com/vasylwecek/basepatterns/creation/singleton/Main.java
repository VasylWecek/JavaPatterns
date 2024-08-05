package main.java.com.vasylwecek.basepatterns.creation.singleton;

public class Main {
    public static void main(String[] args) {
        ServerConnection serverConnection1 = ServerConnection.getInstance();

        serverConnection1.sendData("Server request");

        String response = serverConnection1.receiveData();
        System.out.println("Server response: " + response);

        ServerConnection serverConnection2 = ServerConnection.getInstance();

        System.out.println("Both objects are the same: " + (serverConnection1 == serverConnection2));
    }
}
