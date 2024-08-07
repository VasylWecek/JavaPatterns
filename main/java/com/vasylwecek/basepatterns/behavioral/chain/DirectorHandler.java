package main.java.com.vasylwecek.basepatterns.behavioral.chain;

public class DirectorHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() <= 2) {
            System.out.println("Director accept request: " + request.getRequestType());
        } else if (nextHandler !=null){
            nextHandler.handleRequest(request);
        }
    }
}