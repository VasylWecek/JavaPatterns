package main.java.com.vasylwecek.basepatterns.behavioral.chain;

public class CEOHandler extends Handler{
    @Override
    public void handleRequest(Request request) {
        if ( request.getLevel() <= 3){
            System.out.println("CEO accept request: " + request.getRequestType());
        } else {
            System.out.println("CEO reject request: " + request.getRequestType());
        }
    }
}
