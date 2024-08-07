package main.java.com.vasylwecek.basepatterns.behavioral.chain;

public class Request {
    private String requestType;
    private int level;

    public Request(String requestType, int level){
        this.requestType = requestType;
        this.level = level;
    }

    public String getRequestType() {
        return requestType;
    }

    public int getLevel() {
        return level;
    }
}
