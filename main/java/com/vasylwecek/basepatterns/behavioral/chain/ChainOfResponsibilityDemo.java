package main.java.com.vasylwecek.basepatterns.behavioral.chain;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler manager = new ManagerHandler();
        Handler director = new DirectorHandler();
        Handler ceo = new CEOHandler();

        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        Request request1 = new Request("salary increase", 1);
        Request request2 = new Request("new level", 2);
        Request request3 = new Request("change strategy", 3);
        Request request4 = new Request("alias another company", 4);

        manager.handleRequest(request1);
        manager.handleRequest(request2);
        manager.handleRequest(request3);
        manager.handleRequest(request4);
    }
}
