package main.java.com.vasylwecek.basepatterns.behavioral.visitor;

public class Bank implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
