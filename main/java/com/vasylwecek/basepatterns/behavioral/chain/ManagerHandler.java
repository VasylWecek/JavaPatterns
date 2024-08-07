package main.java.com.vasylwecek.basepatterns.behavioral.chain;

public class ManagerHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel()<= 1){
            System.out.println("Manager accept request: " + request.getRequestType());
        } else if (nextHandler != null ){
            nextHandler.handleRequest(request);
        }
    }
}
